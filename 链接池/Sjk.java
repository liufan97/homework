package R17;

import java.sql.DriverManager;
import java.util.LinkedList;
import com.mysql.jdbc.Connection;

public class Sjk {
	public static void main(String[] args) {
			
	}
	//���ӳ�
	static LinkedList<Connection> li = new LinkedList<Connection>();
	static{
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			//����20������ѭ��ʹ��
			for(int i = 0;i<20;i++){
				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","7274");
				if(!con.isClosed()){//��ѯ�� Connection�����Ƿ��Ѿ����ر�
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
					System.out.println("��ʣ"+li.size()+"��");
					return li.removeFirst();//ʹ�ú�����ӳ���ɾ��
				}else{
					try {
						System.out.println("�ȴ�");
						li.wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	//�黹����
	public static void huan(Connection con){
		synchronized(li){
			li.add(con);
			li.notifyAll();//����һ���ȴ����߳�
			System.out.println("���˻���������");
		}
	}
}





