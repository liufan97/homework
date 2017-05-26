//字节流实现1
package R2;
import java.net.*;
import java.io.*;
import java.util.*;

public class Gh {
	public static void main(String[] args) throws Exception {
		Socket soc = new Socket("192.168.199.159",9999);
		OutputStream out = soc.getOutputStream();//getOutputStream返回此套接字的输出流
		Scanner z = new Scanner(System.in);
		System.out.println("请输入内容");
		String s = z.next();
		out.write(s.getBytes());
		out.flush();
		//out.close();
		soc.shutdownOutput();
		//接收服务器发送的消息
		InputStream in = soc.getInputStream();
		byte[] b = new byte[1024];
		int i = 0;
		StringBuffer ss = new StringBuffer();
		while((i = in.read(b))!=-1){
			ss.append(new String(b,0,i));
		}
		System.out.println("服务器返回的内容"+ss);
		out.close();
		in.close();
	}
}
