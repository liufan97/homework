public class Jsh{
	public static void main(String[] args){
		int a,b=0,c=0;
		for(a=100;a<=200;a++){
			if(a%2!=0){
				b=b+a;
				c++;
			}
		}
		System.out.println("������"+b);
		System.out.println("��������"+c);
	}
}