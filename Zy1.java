//׷��д��
package Shiyan;
import java.util.*;
import java.io.*;
public class Zy1 {
	static Scanner z = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		File f = new File("D:/files/du.txt");
		Reader re = new FileReader(f);//�����е��ַ���ȡ����
		char[] c = new char[(int)f.length()];
		System.out.println("����"+f.length());
		re.read(c);//��ȡ����
		String str1 = new String(c);
		re.close();
		//��ȡ����
		System.out.println("��������1");
		String s = z.next();
		System.out.println("��������2");
		String s1 = z.next();
		Writer wr = new FileWriter(f);
		if(str1.equals("")){
			wr.write(s+"\r\n"+s1);//д��
		}else{
			wr.write(str1+"\r\n"+s+"\r\n"+s1);
		}
		wr.close();
		/*if(str1.equals(s+"\r\n"+s1)){
			System.out.println("���");
		}else{
			System.out.println("�����");
		}*/
	}
}









