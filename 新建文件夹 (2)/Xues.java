import java.util.*;
public class Xues
{	
	static int i;
	static Xues1[] zm = new Xues1[100];
	static Scanner z = new Scanner(System.in);
	static String name;
	public static void main(String [] args){
		dh();
	}
	public static void dh(){
		System.out.println("输入数字选择方式");
		System.out.println("1.增");
		System.out.println("2.查");
		System.out.println("3.改");
		System.out.println("4.减");
		System.out.println("5.退出");
		int c = z.nextInt();
		while(true){
			switch(c){
				case 1:zeng();
				break;
				case 2:cha();
				break;
				case 3:gai();
				break;
				case 4:shan();
				break;
				case 5:System.exit(0);
				break;
				default:
				System.out.println("输入有误请重新输入数字");
				dh();
				break;

			}
		}
	}
	public static void zeng(){
		boolean zj = true;
		while(zj){
			System.out.println("name");
			name = z.next();
			System.out.println("nl");
			int nl = z.nextInt();
			System.out.println("xb");
			char xb = z.next().charAt(0);
			Xues1 ll = new Xues1(name,nl,xb);
			zm[i] = ll;
			i++;
			System.out.println("是否继续输入\n是则输入1否则输入2");
			int c = z.nextInt();
			if(c==1){
			}else{
				if(c==2){
					zj = false;
				}else{
					
				}
			}
		}
		dh();
	}
	public static void cha(){
		//for(/*Xues1 c:zm*/int i=0;i<100;i++){
		System.out.println("1.精确查询\t2全部查询");
		int cc = z.nextInt();
		if(cc == 1){
			System.out.println("输入要查询的名字");
			String namec = z.next();
			for(Xues1 ss:zm){
				if(ss!=null && ss.name.equals(namec)){
					ss.cxf();
				}
			}
		}else if(cc==2){
			for(Xues1 ss:zm){
				if(ss!=null){
					ss.cxf();
				}
			}
		}
		System.out.println("是否继续查询 继续“1” 否“2”");
		int jx = z.nextInt();
		if(jx==1){
			cha();
		}else{
			dh();
		}
	}
	//}
	public static void gai(){
		System.out.println("请输入要更新的学生姓名");
		String mz = z.next();
		for(int i=0;i<zm.length;i++){
			if(zm[i]!= null && mz.equals(zm[i].name)){
				zm[i] = null;
				System.out.println("输入姓名");
				String name = z.next();
				System.out.println("输入年龄");
				int age = z.nextInt();
				System.out.println("输入性别");
				char sex = z.next().charAt(0);
				Xues1 s1 = new Xues1(name,age,sex);
				zm[i] = s1;
			}
		}
		System.out.println("“1” 返回 “2” 继续更新");
		int gx = z.nextInt();
		if(gx==1){
			dh();
		}else{
			gai();
		}
	}
	public static void shan(){
		System.out.println("请输入要删除的学生姓名");
		String sc = z.next();
		for(int i=0;i<zm.length;i++){
			if(zm[i]!= null && zm[i].name.equals(sc)){
					zm[i] = null;
			}
		}
		System.out.println("删除成功; 1 返回 2 继续删除");
		int c = z.nextInt();
		if(c==1){
			dh();
		}else{
			shan();
		}
	}
}