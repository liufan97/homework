//ʯͷ���Ӳ�
package z;

import java.util.Scanner;
public class Jianzi {

	public static void main(String[] args) {
		System.out.println("����һ���� 1=ʯͷ  2=����   3= ��");
		Scanner z = new Scanner(System.in);
		int a = z.nextInt();
		int c = (int)(Math.random()*3+1);
		System.out.println(c);
		new Jianzi1().ff(a, c);
	}
}
