package Y4r27;
import java.util.*;
public class Yh2 implements Runnable{
	private Yh3 yh3;
	private int qv;
	static Scanner z = new Scanner(System.in);
	public void run() {
		while(true){//
			synchronized(yh3){//
				//选择
				System.out.println("1.取钱  2.存钱");
				int i = z.nextInt();
				if(i == 1){
					System.out.println("输入要取的钱数");
					qv = z.nextInt();
					if(yh3.qian() < qv){
						System.out.println("余额不足   共"+yh3.qian()+"差"+(qv-yh3.qian()));
					}else{
						yh3.setqian(yh3.qian()-qv);
						System.out.println("取"+qv+"\t还剩"+yh3.qian());
					}
				}else if(i == 2){
					System.out.println("输入存入的金额");
					int qian1 = z.nextInt();
					yh3.setqian(yh3.qian()+qian1);
					System.out.println("余额"+yh3.qian());
				}
			}
		}
		
	}
	public Yh2(Yh3 yh3,int qv){
		this.yh3 = yh3;
		this.qv = qv;
	}
}
