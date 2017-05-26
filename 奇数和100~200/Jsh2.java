public class Jsh2{
	public static void main(String[] args){
		int a=100,b=0;
		do{
			if(a%2!=0){
				b=b+a;
			}
			a++;
		}while(a<=200);
		System.out.println(b);
	}
}