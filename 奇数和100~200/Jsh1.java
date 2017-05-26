public class Jsh1{
	public static void main(String[] args){
		int a=100,b=0;
		while(a<=200){
			if(a%2!=0){
				b=b+a;
			}
			a++;
		}
		System.out.println(b);
	}
}