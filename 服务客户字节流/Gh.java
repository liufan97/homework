//�ֽ���ʵ��1
package R2;
import java.net.*;
import java.io.*;
import java.util.*;

public class Gh {
	public static void main(String[] args) throws Exception {
		Socket soc = new Socket("192.168.199.159",9999);
		OutputStream out = soc.getOutputStream();//getOutputStream���ش��׽��ֵ������
		Scanner z = new Scanner(System.in);
		System.out.println("����������");
		String s = z.next();
		out.write(s.getBytes());
		out.flush();
		//out.close();
		soc.shutdownOutput();
		//���շ��������͵���Ϣ
		InputStream in = soc.getInputStream();
		byte[] b = new byte[1024];
		int i = 0;
		StringBuffer ss = new StringBuffer();
		while((i = in.read(b))!=-1){
			ss.append(new String(b,0,i));
		}
		System.out.println("���������ص�����"+ss);
		out.close();
		in.close();
	}
}
