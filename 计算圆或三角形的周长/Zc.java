import java.util.*;
public class Zc
{
	static Scanner z = new Scanner(System.in);
	public static void main(String [] args){
		boolean c = true;
		while(c){
			Zx zc1 = new Zc1();
			Zx zc2 = new Zc2();
			System.out.println("1.Ô²	2.Èý½ÇÐÎ");
			int a = z.nextInt();
			if(a==1){
				zc1.zhouchang();
				c = false;
			}else if(a==2){
				zc2.zhouchang();
				c = false;
			}else{
				System.out.println("ÓÐÎó");
			}
		}
		
		
		
	}
}