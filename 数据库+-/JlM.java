package R12;
import java.sql.*;
public class JlM {

	public static void main(String[] args) throws Exception {
		//����Connection����
		Connection con;
		//����������
		String driver = "com.mysql.jdbc.Driver";
		//urlָ��Ҫ���ʵ����ݿ���mydsta
		String url = "jdbc:mysql://localhost:3306/sqltestdb";
		//Mysql����ʱ���û���
		String user = "root";
		//Mysql����ʱ����
		String password = "7274";
		//������ѯ�����
		
		//������������
		Class.forName(driver);
		//1.getConnection()����������Mysql���ݿ�
		con = Mysqldl.getCon();//�������������ݿ� URL������
		if(!con.isClosed()){//��ѯ�� Connection�����Ƿ��Ѿ����ر�
			System.out.println("cc");
		}
		//2.����statement���������ִ��SQl���
		Statement statement = Mysqldl.getCon().createStatement();
		//Ҫִ�е�SQL���
		String sql = "select * from emp";
		//3.ResultSet��
		ResultSet rs = statement.executeQuery(sql);
		System.out.println("-----------------");
		System.out.println("ִ�н��������ʾ:");  
		System.out.println("-----------------");  
		System.out.println("����" + "\t" + "ְ��");  
		System.out.println("-----------------");  
		
		
		String job = null;
		String id = null;
		while(rs.next()){
			//��ȡstuname��������
			job = rs.getString("job");
			//��ȡstuid��������
			id = rs.getString("ename");
			//������
			System.out.println(id+"\t"+job);
		}
		//rs.close();
		//con.close();
		System.out.println("���ݿ����ݳɹ���ȡ");
  		
		//
		
		/*//��������
		String name;
		String id1;
		
		PreparedStatement psql;
		ResultSet res;
		//Ԥ����������ݣ���������������
		psql = con.prepareStatement("insert into emp (empno,ename,job,he,sal)"
							+"values(?,?,?,?,?)");
		psql.setInt(1,6666);
		psql.setString(2,"����");
		psql.setString(3,"�ܲ�");
		
		DateFormat dt2 = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date myDate2 = dt2.parse("2010-09-13");
		psql.setDate(4,new java.sql.Date(myDate2.getTime()));
		psql.setFloat(5,(float) 2000.3);
		*/
		
		
		//
		PreparedStatement psql;
		psql = con.prepareStatement("update emp set sal = ? where ename = ?");
		psql.setFloat(1,(float) 5000.0);
		psql.setString(2,"����");
		//
		psql = con.prepareStatement("delete from emp where sal > ?");
		psql.setFloat(1, 4500);
		
		
		psql.executeUpdate();	//ִ�и���
		
		psql.close();
		rs.close();
		con.close();
	}

}


















