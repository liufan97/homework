public class Sanbs{
	public static void main(String[] args){
		int a,b=0;
		for(a=1;a<=100;a++){
			if(a%3==0){
				b++;
				System.out.println("三的倍数有"+a);
			}
		}
		System.out.println("共"+b+"个");
	}
}