package Y4r26;

public class Piao1 extends Thread {
	Piao2 d;
	public Piao1(Piao2 d){
		this.d = d;
	}
	/*private static int i = 50;
	private  String name;
	public Piao1(String name){
		this.name = name;
	}*/
	public void run(){
		synchronized(d){
			d.sale();
		}
		/*while(true){
			if(i <= 0){
				System.out.println(this.name+"已售馨");
				break;
			}else{
				System.out.println(this.name+"已售第"+i+"票");
				i--;
			}	
		}	*/
	}
}
