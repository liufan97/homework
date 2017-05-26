import java.util.Scanner;
public class Dangs{
	public static void main(String[] args){
		int b,c,d,e,f;
		System.out.println("ÊäÈë100µÄ±¶Êı");
		Scanner z=new Scanner(System.in);
		int a=z.nextInt();
		b=jia(0,a/4);
		c=jia((a/4+1),a/2);
		d=jia((a/2+1),3*a/4);
		f=jia((3*a/4+1),a);
		f=d+f+c+b;
		System.out.println(f);
	}

public static int jia(int x,int y){
		int a=0;
		for(;x<=y;x++){
			a=a+x;
		}
		return a;
	}
}
