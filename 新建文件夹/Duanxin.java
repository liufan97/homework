import java.util.*;
public class Duanxin
{
	static Scanner z = new Scanner(System.in);
	public static void main(String[] args){
		String hm = z.next();
		Dx1 dx1 = new Dx1(hm);
		Dx2 dx2 = new Dx2(dx1);
		Dx3 dx3 = new Dx3(dx2);
		dx3.d();
	}
}