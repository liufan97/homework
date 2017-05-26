package Y4r26;

public class Piao2 {
	
	private static Piao3 p3 = new Piao3("linyi",51);
	private String name;
	static int a,b,c;
	public Piao2(String name){
			//this.i = i;
			this.name = name;	
	}
	public void sale(){
		while(true){
			int i = p3.Num();
			i--;
			p3.s(i);
			if(i<1){
				System.out.println(name+"已售馨");
				if(" yi".equals(name)){
					System.out.println("yi售"+a+"张票");
				}else if(" er".equals(name)){
					System.out.println("er售"+b+"张票");
				}else System.out.println("san售"+c+"张票");;
				break;
			}else{
				System.out.println(name+"已售第"+i+"票");
				if(" yi".equals(name)){
					a++;
				}else if(" er".equals(name)){
					b++;
				}else c++;
			}
		}
	}
}




/*
 * if(this.name.equals("yi")){
					a++;
				}else if(this.name.equals("er")){
					b++;
				}else{
					c++;
					}
		System.out.println("yi"+a);
		System.out.println("er"+b);
		System.out.println("san"+c);
 * */
