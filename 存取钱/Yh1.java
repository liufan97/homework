package Y4r27;

public class Yh1 {

	public static void main(String[] args) {
		Yh3 yh3 = new Yh3("lili",4000);//��ʼ��Ǯ��
		Yh2 yh21 = new Yh2(yh3,0);//�����߳�
		Yh2 yh22 = new Yh2(yh3,0);
		new Thread(yh21).start();//�������״̬
		new Thread(yh22).start();
	}

}
