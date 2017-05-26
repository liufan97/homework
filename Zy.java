//.java的文件
package Shiyan;
import java.io.*;
public class Zy {

	public static void main(String[] args) {
		File f = new File("D:/java");
		ff(f);
	}
	public static void ff(File f){
		if(f.isDirectory()){//测试此抽象路径名表示的文件是否是一个目录
			File[] fi = f.listFiles();//返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
			for(File fq:fi){
				ff(fq);
			}
		}else if(f.getName().endsWith("java")){
			System.out.println(f.getAbsolutePath());// 返回此抽象路径名的绝对路径名字符串。
		}
	}

}
