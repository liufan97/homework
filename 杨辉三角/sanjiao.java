public class sanjiao
{
	public static void main(String[] args){
		int i,j;
		int[][] a=new int[15][15];
		for(i=0;i<=14;i++){
			for(j=0;j<=14;j++){		
					a[i][j]=1;	
			}
		}
		for(i=1;i<=14;i++){
			for(j=1;j<i;j++){
				a[i][j]=a[i-1][j]+a[i-1][j-1];
			}
		}
		for(i=0;i<=14;i++){
			for(j=0;j<=i;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}