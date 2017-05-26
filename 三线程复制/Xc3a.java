//三线程读文件
package R2;
import java.io.*;

public class Xc3a implements Runnable {
	private int a;
	private int b;
	public Xc3a(){}
	public Xc3a(int a,int b){
		this.a = a;
		this.b = b;
	}
	
	String nr = null;
	byte[] z = new byte[1024];
	public void run(){
		synchronized(z){
			System.out.println(a+"a he b"+b);
			File f = new File("D:/files/du.txt");
			File f1 = new File("D:/files/du1.txt");
			try {
				InputStream in = new FileInputStream(f);
				in.read(z);
				nr = new String(z);
				System.out.println(nr);
				in.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
			try {
				OutputStream out = new FileOutputStream(f1,true);
				out.write(z,a,b);//指定 byte 数组中从偏移量a开始的b个字节写入此文件输出流。
				out.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}