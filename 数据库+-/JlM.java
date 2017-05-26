package R12;
import java.sql.*;
public class JlM {

	public static void main(String[] args) throws Exception {
		//声明Connection对象
		Connection con;
		//驱动程序名
		String driver = "com.mysql.jdbc.Driver";
		//url指向要访问的数据库名mydsta
		String url = "jdbc:mysql://localhost:3306/sqltestdb";
		//Mysql配置时的用户名
		String user = "root";
		//Mysql配置时密码
		String password = "7274";
		//遍历查询结果集
		
		//加载驱动程序
		Class.forName(driver);
		//1.getConnection()方法，连接Mysql数据库
		con = Mysqldl.getCon();//建立到给定数据库 URL的连接
		if(!con.isClosed()){//查询此 Connection对象是否已经被关闭
			System.out.println("cc");
		}
		//2.创建statement类对象，用来执行SQl语句
		Statement statement = Mysqldl.getCon().createStatement();
		//要执行的SQL语句
		String sql = "select * from emp";
		//3.ResultSet类
		ResultSet rs = statement.executeQuery(sql);
		System.out.println("-----------------");
		System.out.println("执行结果如下所示:");  
		System.out.println("-----------------");  
		System.out.println("姓名" + "\t" + "职称");  
		System.out.println("-----------------");  
		
		
		String job = null;
		String id = null;
		while(rs.next()){
			//获取stuname这列数据
			job = rs.getString("job");
			//获取stuid这列数据
			id = rs.getString("ename");
			//输出结果
			System.out.println(id+"\t"+job);
		}
		//rs.close();
		//con.close();
		System.out.println("数据库数据成功获取");
  		
		//
		
		/*//增加数据
		String name;
		String id1;
		
		PreparedStatement psql;
		ResultSet res;
		//预处理添加数据，其中有两个参数
		psql = con.prepareStatement("insert into emp (empno,ename,job,he,sal)"
							+"values(?,?,?,?,?)");
		psql.setInt(1,6666);
		psql.setString(2,"王刚");
		psql.setString(3,"总裁");
		
		DateFormat dt2 = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date myDate2 = dt2.parse("2010-09-13");
		psql.setDate(4,new java.sql.Date(myDate2.getTime()));
		psql.setFloat(5,(float) 2000.3);
		*/
		
		
		//
		PreparedStatement psql;
		psql = con.prepareStatement("update emp set sal = ? where ename = ?");
		psql.setFloat(1,(float) 5000.0);
		psql.setString(2,"王刚");
		//
		psql = con.prepareStatement("delete from emp where sal > ?");
		psql.setFloat(1, 4500);
		
		
		psql.executeUpdate();	//执行更新
		
		psql.close();
		rs.close();
		con.close();
	}

}


















