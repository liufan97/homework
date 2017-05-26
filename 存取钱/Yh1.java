package Y4r27;

public class Yh1 {

	public static void main(String[] args) {
		Yh3 yh3 = new Yh3("lili",4000);//开始的钱数
		Yh2 yh21 = new Yh2(yh3,0);//创建线程
		Yh2 yh22 = new Yh2(yh3,0);
		new Thread(yh21).start();//进入就绪状态
		new Thread(yh22).start();
	}

}
