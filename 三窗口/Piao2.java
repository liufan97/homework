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
				System.out.println(name+"����ܰ");
				if(" yi".equals(name)){
					System.out.println("yi��"+a+"��Ʊ");
				}else if(" er".equals(name)){
					System.out.println("er��"+b+"��Ʊ");
				}else System.out.println("san��"+c+"��Ʊ");;
				break;
			}else{
				System.out.println(name+"���۵�"+i+"Ʊ");
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
