import java.util.Scanner;
public class Jicheng{
	public static void main(String[] args){
		int a,b,c=0,d;
		for(a=1;a<=10;a++){
			for(b=1,d=1;d<=a;d++){
				b=d*b;
			}
			c=c+b;
			System.out.println(a+"�Ľ׳���"+b);
		}
		System.out.println("һ��ʮ�Ľ׳˺�Ϊ"+c);
	}
}