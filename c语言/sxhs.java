public class sxhs
{
	public static void main(String[] args) 
	{
	int a,b,c,d;
		for(a=100;a<=999;a++){
			b=a/100;
			c=a/10;
			c=c%10;
			d=a%10;
			if(a==b*b*b+c*c*c+d*d*d){
				System.out.printf("%dÊÇ\t",a);
			}
		}
	}
}
