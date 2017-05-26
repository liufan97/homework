public class Sanbs2{
	public static void main(String[] args){
		int a=1,b=0;
		while(a<=100){
			if(a%3==0){
				b++;
				System.out.println("三的倍数有"+a);
			}
			a++;
		}
		System.out.println("共"+b+"个");
	}
}