package Y4r27;
import java.util.*;
public class Yh2 implements Runnable{
	private Yh3 yh3;
	private int qv;
	static Scanner z = new Scanner(System.in);
	public void run() {
		while(true){//
			synchronized(yh3){//
				//ѡ��
				System.out.println("1.ȡǮ  2.��Ǯ");
				int i = z.nextInt();
				if(i == 1){
					System.out.println("����Ҫȡ��Ǯ��");
					qv = z.nextInt();
					if(yh3.qian() < qv){
						System.out.println("����   ��"+yh3.qian()+"��"+(qv-yh3.qian()));
					}else{
						yh3.setqian(yh3.qian()-qv);
						System.out.println("ȡ"+qv+"\t��ʣ"+yh3.qian());
					}
				}else if(i == 2){
					System.out.println("�������Ľ��");
					int qian1 = z.nextInt();
					yh3.setqian(yh3.qian()+qian1);
					System.out.println("���"+yh3.qian());
				}
			}
		}
		
	}
	public Yh2(Yh3 yh3,int qv){
		this.yh3 = yh3;
		this.qv = qv;
	}
}
