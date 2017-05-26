public class wanshu
{
	public static void main(String[] args){
	int a,b,c=0;
		for(a=1;a<1000;a++,c=0){
			for(b=1;b<a;b++){
				if(a%b==0){
					c=c+b;
				}
			}
		if(a==c){
			System.out.print(a+"\n");
		}
		}
	}
}