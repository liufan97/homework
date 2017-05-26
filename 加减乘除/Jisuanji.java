import java.util.Scanner;
public class Jisuanji{
	public static void main(String[] args){
		System.out.println("输入第一个数");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		System.out.println("输入第二个数");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int c,d,e,f;
		c=a*b;
		d=a+b;
		e=a/b;
		f=a-b;
		System.out.printf("%d乘%d=%d\n",a,b,c);
		System.out.printf("%d加%d=%d\n",a,b,d);
		System.out.printf("%d除%d=%d\n",a,b,e);
		System.out.printf("%d减%d=%d\n",a,b,f);
	}
}