//���̶߳��ļ�
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
				out.write(z,a,b);//ָ�� byte �����д�ƫ����a��ʼ��b���ֽ�д����ļ��������
				out.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}