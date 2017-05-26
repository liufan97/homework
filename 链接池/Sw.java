package R17;
import com.mysql.jdbc.Connection;

public class Sw {

	public static void main(String[] args) {
		
		for(int i=0;i<30;i++){
			Connection con = Sjk.getC();
			Connection con1 = Sjk.getC();
			new Thread(new Xc1(con1)).start();
			new Thread(new Xc(con)).start();
		}
	}
	
}
