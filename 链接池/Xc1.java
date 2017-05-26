package R17;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Xc1 implements Runnable {

	public static void main(String[] args) {
		
	}
	Connection con;
	public Xc1(Connection con){
		this.con = con;
	}

	public void run() {
		try {
			//开始事务
			con.setAutoCommit(false);
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into Shiwu (sw)"
						+"values(?)");
			ps.setString(1,"6565");
			ps.execute();
			//提交
			con.commit();
			Sjk.huan(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
