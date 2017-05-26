package R17;

import java.sql.DriverManager;
import java.util.LinkedList;
import com.mysql.jdbc.Connection;

public class Sjk {
	public static void main(String[] args) {
			
	}
	//链接池
	static LinkedList<Connection> li = new LinkedList<Connection>();
	static{
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			//建立20个链接循环使用
			for(int i = 0;i<20;i++){
				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","7274");
				if(!con.isClosed()){//查询此 Connection对象是否已经被关闭
					li.add(con);
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static Connection getC(){
		while(true){
			synchronized(li){
				if(li.size()>0){
					System.out.println("还剩"+li.size()+"个");
					return li.removeFirst();//使用后从链接池中删除
				}else{
					try {
						System.out.println("等待");
						li.wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	//归还链接
	public static void huan(Connection con){
		synchronized(li){
			li.add(con);
			li.notifyAll();//唤醒一个等待的线程
			System.out.println("有人还回了链接");
		}
	}
}





