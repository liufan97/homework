public class Jicheng2{
	public static void main(String[] args){
		int a=1,b,c=0,d;
		do{
			b=1;
			d=1;
			do{
				b=b*d;
				d++;
			}while(d<=a);
			System.out.println(a+"的阶乘是"+b);
			a++;
			c=c+b;
		}while(a<=10);
		System.out.println("一到十的阶乘和是"+c);
	}
}