import java.util.Scanner;
public class Jicheng{
	public static void main(String[] args){
		int a,b,c=0,d;
		for(a=1;a<=10;a++){
			for(b=1,d=1;d<=a;d++){
				b=d*b;
			}
			c=c+b;
			System.out.println(a+"的阶乘是"+b);
		}
		System.out.println("一到十的阶乘和为"+c);
	}
}