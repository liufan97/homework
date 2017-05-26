import java.util.*;
public class Chaoshi1{
	static int i;
	static Chaoshi[] m= new Chaoshi[100];
	static Scanner z = new Scanner(System.in);
	public static void caidan(){
		System.out.println("输入功能所对应的数字");
		System.out.println("1.增加商品");
		System.out.println("2.减少或删除商品");
		System.out.println("3.更新商品信息");
		System.out.println("4.查询商品信息");
		System.out.println("5.退出");
		int a = z.nextInt();
		boolean zj =true;
		while(zj){
			switch(a){
				case 1:jia();
					break;
				case 2:jian();
					break;
				case 3:gai();
					break;
				case 4:cha();
					break;
				case 5:System.exit(0);
					break;
				default :System.out.println("youwu");
					zj=false;
			}
		}
		
	}
	public static void jia(){
		boolean zj1 =true;
		while(zj1){
			System.out.println("商品名");
			String sname = z.next();
			System.out.println("商品类型");
			String lx = z.next();
			System.out.println("商品价格");
			int jg = z.nextInt();
			System.out.println("商品数量");
			int sl = z.nextInt();
			Chaoshi xx = new Chaoshi(sname,lx,jg,sl);
			m[i] = xx;
			i++;
			int b=1;
			while(b==1){
				System.out.println("是否继续1.继续  2.返回主菜单");
				int jx1 = z.nextInt();
				if(jx1 == 1){
					b=2;
				}else if(jx1 == 2){
						b=2;
					caidan();
				}else{
					System.out.println("输入有误");
				}
			}
		}
	}
	public static void cha(){
		boolean zj2 =true;
		while(zj2){
			System.out.println("1.详细查询    2.全部查询");
			int jx2 = z.nextInt();
			if(jx2 == 1){
				System.out.println("输入要查询的商品名");
				String nm = z.next();
				for(int i=0;i<100;i++){
					if(m[i]!=null && nm.equals(m[i].sname)){
						m[i].shuchu();
					}
				}
			}else if(jx2 == 2){
				for(int i=0;i<100;i++){
					if(m[i]!=null){
						m[i].shuchu();
					}
				}
			}
			boolean zj3 = true;
			while(zj3){
				System.out.println("是否继续1.继续   2.返回主菜单");
				int jx5 = z.nextInt();
				if(jx5 == 1){
					cha();
				}else if(jx5==2){
					caidan();
				}else{	
				}
			}
		}
	}
	public static void jian(){
		System.out.println("1.删除商品   2.减少商品数量");
		int xz1 = z.nextInt();
		if(xz1==1){
			System.out.println("输入商品名称");
			String mz5 = z.next();
			for(int i=0;i<100;i++){
				if(m[i]!=null && mz5.equals(m[i].sname)){
					m[i]=null;
				}
			}
			int j=0;
			for(int i=0;i<100;i++,j++){
				if(m[i]==null){
					m[j]=m[i];
				}
			}
		}else if(xz1==2){
			System.out.println("输入商品名称");
			String mc1 = z.next();
			System.out.println("输入减少商品的数量");
			int js = z.nextInt();
			for(int i=0;i<100;i++){
				if(m[i]!=null && mc1.equals(m[i].sname)){
					m[i].sl = m[i].sl-js;
				}
			}
		}
		boolean zj5 = true;
		while(zj5){
			System.out.println("是否继续删除1.继续   2.停止");
			int jx6 = z.nextInt();
			if(jx6 == 1){
				cha();
			}else if(jx6 == 2){
				caidan();
			}
		}
	}
	public static void gai(){
		System.out.println("输入要修改的商品名");
		String xg1 = z.next();
		for(int i=0;i<100;i++){
			if(m[i]!=null && xg1.equals(m[i].sname)){
					System.out.println("输入商品名");
					String sname = z.next();
					System.out.println("输入类型");
					String  lx= z.next();
					System.out.println("输入价格");
					int jg = z.nextInt();
					System.out.println("输入数量");
					int sl = z.nextInt();
					Chaoshi ff = new Chaoshi(sname,lx,jg,sl);
					m[i] = ff;
					System.out.println("更新完成");
			}
			System.out.println("是否继续1   2");
			int jx11 = z.nextInt();
			if(jx11 ==1){
				gai();
			}else if(jx11 ==2){
				caidan();
			}
		}
	}
}