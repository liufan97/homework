package Y4r26;

public class Piao {

	public static void main(String[] args) {
		Piao2 p1 = new Piao2(" yi");
		Piao2 p2 = new Piao2(" er");
		Piao2 p3 = new Piao2("san");
		Piao1 pp1 = new Piao1(p1);
		Piao1 pp2 = new Piao1(p2);
		Piao1 pp3 = new Piao1(p3);
		pp1.start();
		pp2.start();
		pp3.start();
		/*Thread th1 = new Piao1("����һ");
		Thread th2 = new Piao1("���ڶ�");
		Thread th3 = new Piao1("������");
		th1.start();
		th2.start();
		th3.start();*/
	}

}
