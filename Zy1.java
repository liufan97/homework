//追加写入
package Shiyan;
import java.util.*;
import java.io.*;
public class Zy1 {
	static Scanner z = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		File f = new File("D:/files/du.txt");
		Reader re = new FileReader(f);//将已有的字符提取出来
		char[] c = new char[(int)f.length()];
		System.out.println("长度"+f.length());
		re.read(c);//读取内容
		String str1 = new String(c);
		re.close();
		//获取内容
		System.out.println("输入内容1");
		String s = z.next();
		System.out.println("输入内容2");
		String s1 = z.next();
		Writer wr = new FileWriter(f);
		if(str1.equals("")){
			wr.write(s+"\r\n"+s1);//写入
		}else{
			wr.write(str1+"\r\n"+s+"\r\n"+s1);
		}
		wr.close();
		/*if(str1.equals(s+"\r\n"+s1)){
			System.out.println("相等");
		}else{
			System.out.println("不相等");
		}*/
	}
}









