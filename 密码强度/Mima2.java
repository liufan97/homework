import java.util.*;
public class Mima2{
	public static void main(String[] args){
		Scanner z=new Scanner(System.in);
		String a=z.next();
		int c=a.length();
		int e=0,f=0,n=0,m=0;
		char[] d=new char[c];
		for(int i=0;i<c;i++){
			d[i]=a.charAt(i);
			if(d[i]>=48 && d[i]<=57){
				e=1;
			}
			if(d[i]>=65 && d[i]<=90 || d[i]>=97 && d[i]<=122){
				f=1;
			}
			if(d[i]<65 && d[i]>57 || d[i]<48 || d[i]>90 && d[i]<97 || d[i]>122 && d[i]<=127){
				n=1;
			}
		}
		m=e+f+n;
		if(c<=5){
			m=6;
			System.out.println("密码长度过短请重新输入");
		}
		if(m==0){
			System.out.println("密码格式不对请重新输入");
		}
		if(m==1){
			System.out.println("低");
		}else if(m==2){
				System.out.println("中");
			  }else if(m==3){
					System.out.println("高");
				  }
	}
}