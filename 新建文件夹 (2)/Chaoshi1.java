import java.util.*;
public class Chaoshi1{
	static int i;
	static Chaoshi[] m= new Chaoshi[100];
	static Scanner z = new Scanner(System.in);
	public static void caidan(){
		System.out.println("���빦������Ӧ������");
		System.out.println("1.������Ʒ");
		System.out.println("2.���ٻ�ɾ����Ʒ");
		System.out.println("3.������Ʒ��Ϣ");
		System.out.println("4.��ѯ��Ʒ��Ϣ");
		System.out.println("5.�˳�");
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
			System.out.println("��Ʒ��");
			String sname = z.next();
			System.out.println("��Ʒ����");
			String lx = z.next();
			System.out.println("��Ʒ�۸�");
			int jg = z.nextInt();
			System.out.println("��Ʒ����");
			int sl = z.nextInt();
			Chaoshi xx = new Chaoshi(sname,lx,jg,sl);
			m[i] = xx;
			i++;
			int b=1;
			while(b==1){
				System.out.println("�Ƿ����1.����  2.�������˵�");
				int jx1 = z.nextInt();
				if(jx1 == 1){
					b=2;
				}else if(jx1 == 2){
						b=2;
					caidan();
				}else{
					System.out.println("��������");
				}
			}
		}
	}
	public static void cha(){
		boolean zj2 =true;
		while(zj2){
			System.out.println("1.��ϸ��ѯ    2.ȫ����ѯ");
			int jx2 = z.nextInt();
			if(jx2 == 1){
				System.out.println("����Ҫ��ѯ����Ʒ��");
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
				System.out.println("�Ƿ����1.����   2.�������˵�");
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
		System.out.println("1.ɾ����Ʒ   2.������Ʒ����");
		int xz1 = z.nextInt();
		if(xz1==1){
			System.out.println("������Ʒ����");
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
			System.out.println("������Ʒ����");
			String mc1 = z.next();
			System.out.println("���������Ʒ������");
			int js = z.nextInt();
			for(int i=0;i<100;i++){
				if(m[i]!=null && mc1.equals(m[i].sname)){
					m[i].sl = m[i].sl-js;
				}
			}
		}
		boolean zj5 = true;
		while(zj5){
			System.out.println("�Ƿ����ɾ��1.����   2.ֹͣ");
			int jx6 = z.nextInt();
			if(jx6 == 1){
				cha();
			}else if(jx6 == 2){
				caidan();
			}
		}
	}
	public static void gai(){
		System.out.println("����Ҫ�޸ĵ���Ʒ��");
		String xg1 = z.next();
		for(int i=0;i<100;i++){
			if(m[i]!=null && xg1.equals(m[i].sname)){
					System.out.println("������Ʒ��");
					String sname = z.next();
					System.out.println("��������");
					String  lx= z.next();
					System.out.println("����۸�");
					int jg = z.nextInt();
					System.out.println("��������");
					int sl = z.nextInt();
					Chaoshi ff = new Chaoshi(sname,lx,jg,sl);
					m[i] = ff;
					System.out.println("�������");
			}
			System.out.println("�Ƿ����1   2");
			int jx11 = z.nextInt();
			if(jx11 ==1){
				gai();
			}else if(jx11 ==2){
				caidan();
			}
		}
	}
}