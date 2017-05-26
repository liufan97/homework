//判断是否是三角形
import java.util.*;
public class S2{

	public static void main(String [] args)throws sj{
		S2 s2 = new S2();
		System.out.println("shurusangeshu");
		Scanner z = new Scanner(System.in);
		int a = z.nextInt();
		int b = z.nextInt();
		int c = z.nextInt();
		s2.sanjiao(a,b,c);
	}
	
	public void sanjiao(int a,int b,int c) throws sj{
		if(a+b>c && a+c>b && c+b>a && a-b<c && a-c<b && c-b<a){
			
			System.out.println(a+"\t"+b+"\t"+c);
		}else{
			throw new sj("不能构成三角形");
		}
	}
}


class sj extends Exception
{
	public sj(String a){
		super(a);
	}
	public sj(){
		super();
	}
}