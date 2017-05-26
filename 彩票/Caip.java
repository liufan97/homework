//彩票
package z;
import java.util.*;
public class Caip {

	public static void main(String[] args) {
		int n=0;
		Scanner z = new  Scanner(System.in);
		System.out.println("输入");
		int [] a = new int[7];
		int [] c= new int[7];
		for(int i=0;i<7;i++){
			a[i] = z.nextInt();
		}
		for(int i=0;i<7;i++){
			c[i] = (int)(Math.random()*35+1);
			int w =i;
			for(int n1=0;n1<w;n1++){
				if(c[i] == c[n1]){
					c[i] = (int)(Math.random()*35);
					n1=0;
				}
			}
		}
		for(int i = 0;i<7;i++){
			for(int e = 0;e<7;e++){
				if(a[i] == c[e]){
					n++;
					break;
				}
			}
		}
		for(int i=0;i<7;i++){
			System.out.print(c[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<7;i++){
			System.out.print(a[i]+"\t");
		}
		if(n<5){
			System.out.println("没中奖");
		}else if(n == 7){
			System.out.println("一等奖");
		}else if(n == 6){
			System.out.println("二等奖");
		}else if(n == 5){
			System.out.println("三等奖");
		}
	}
}


