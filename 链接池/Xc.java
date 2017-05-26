package R17;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Xc implements Runnable {

	public static void main(String[] args) {

	}
	Connection con;
	public Xc(Connection con){
		this.con = con;
	}
	public void run() {
		try {
			con.setAutoCommit(false);
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("update Shiwu set sw = ? where sw = ?");
			ps.setString(1,"4343");
			ps.setString(2,"6565");
			ps.executeUpdate();
			con.commit();
			Sjk.huan(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
