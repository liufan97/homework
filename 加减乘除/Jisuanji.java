import java.util.Scanner;
public class Jisuanji{
	public static void main(String[] args){
		System.out.println("�����һ����");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		System.out.println("����ڶ�����");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int c,d,e,f;
		c=a*b;
		d=a+b;
		e=a/b;
		f=a-b;
		System.out.printf("%d��%d=%d\n",a,b,c);
		System.out.printf("%d��%d=%d\n",a,b,d);
		System.out.printf("%d��%d=%d\n",a,b,e);
		System.out.printf("%d��%d=%d\n",a,b,f);
	}
}