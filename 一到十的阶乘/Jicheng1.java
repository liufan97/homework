public class Jicheng1{
	public static void main(String[] args){
		int a=1,b,c=0,d;
		while(a<=10){
			b=1;
			d=1;
			while(d<=a){
				b=b*d;
				d++;
			}
			System.out.println(a+"�Ľ׳���"+b);
			a++;
			c=c+b;
		}
		System.out.println("һ��ʮ�Ľ׳˺���"+c);
	}
}