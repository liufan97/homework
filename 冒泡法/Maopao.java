import java.util.Scanner;
public class Maopao{
	public static void main(String[] args){
		Scanner z=new Scanner(System.in);
		int i,e,f=0;
		System.out.println("输入要输入的数字个数");
		int d=z.nextInt();
		int[] a=new int[d];
		System.out.println("输入要输入的数字");
		for(i=0;i<=(d-1);i++){
			int c=z.nextInt();
			a[i]=c;
		}
		for(f=0;f<=(d-1);f++){
			for(i=0;i<=(d-2);i++){
				if(a[i]<a[i+1]){
					e=a[i];
					a[i]=a[i+1];
					a[i+1]=e;
				}
			}
		}
		for(i=0;i<=(d-1);i++){
			System.out.print(a[i]+"\t");
		}
	}
}