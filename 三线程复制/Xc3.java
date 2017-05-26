//三线程读文件
package R2;
import java.io.*;
public class Xc3 {

	public static void main(String[] args) throws InterruptedException{
		File f = new File("d:/files/du.txt");
		int a = 0;
		int b = (int)f.length();
		int c = b/3;
		Xc3a xc1 = new Xc3a(0,c);
		Xc3a xc2 = new Xc3a(c,c);
		Xc3a xc3 = new Xc3a(2*c,b-2*c);
		new Thread(xc1).start();
		Thread.sleep(10);
		new Thread(xc2).start();
		Thread.sleep(10);
		new Thread(xc3).start();
	}
}
