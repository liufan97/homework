//�ֽ���ʵ��2
package R2;
import java.net.*;
import java.io.*;

public class Fw {
	public static void main(String[] args) throws Exception {
		ServerSocket ser = new ServerSocket(9999);//����������
		System.out.println("�����������ɹ�");
		Socket soc = ser.accept();//�����˿�
		InputStream i = soc.getInputStream();//����
		byte[] z = new byte[1024];
		int len = 0;
		StringBuffer ss = new StringBuffer();
		while((len = i.read(z))!=-1){
			//append��ָ�����ַ���׷�ӵ����ַ�����
			ss.append(new String(z,0,len));
		}
		System.out.println("���������ܵ�����"+ss);
		String s1 = new String(soc.getInetAddress().getHostAddress());
		System.out.println("��ַ�ǣ�"+s1);
		//�����   ��ͻ��˷�������
		OutputStream out = soc.getOutputStream();
		String s2 = ""+ss;
		out.write(s2.getBytes());
		out.flush();
		System.out.println("�������");
		System.out.println("��������Ϊ"+s2);
		out.close();
		i.close();
	}
}
