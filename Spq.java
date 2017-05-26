public class Spq{
	public static void main(String [] args){
		sss s = new sss();
		s.cong();
	}
}

class sss extends sd{
	public void cong(){
		System.out.println("dsghw");
	}
}

interface Spq1{
	void ci();
	void cong();
	void s();
}
abstract class sd implements Spq1{
	public void ci(){};
	public void cong(){};
	public void s(){};
}


