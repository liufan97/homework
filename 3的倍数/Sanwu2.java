public class Sanwu2{
	public static void main(String[] args){
		int a=4,b=0;
		do{
			if(a%3==0){
				b++;
				System.out.println("三的倍数有"+a);
			}
			a++;
		}while(b<5);
	}
}