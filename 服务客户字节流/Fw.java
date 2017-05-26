//字节流实现2
package R2;
import java.net.*;
import java.io.*;

public class Fw {
	public static void main(String[] args) throws Exception {
		ServerSocket ser = new ServerSocket(9999);//创建服务器
		System.out.println("服务器创建成功");
		Socket soc = ser.accept();//监听端口
		InputStream i = soc.getInputStream();//输入
		byte[] z = new byte[1024];
		int len = 0;
		StringBuffer ss = new StringBuffer();
		while((len = i.read(z))!=-1){
			//append将指定的字符串追加到此字符序列
			ss.append(new String(z,0,len));
		}
		System.out.println("服务器接受的内容"+ss);
		String s1 = new String(soc.getInetAddress().getHostAddress());
		System.out.println("地址是："+s1);
		//输出流   向客户端返回内容
		OutputStream out = soc.getOutputStream();
		String s2 = ""+ss;
		out.write(s2.getBytes());
		out.flush();
		System.out.println("返回完成");
		System.out.println("返回内容为"+s2);
		out.close();
		i.close();
	}
}
