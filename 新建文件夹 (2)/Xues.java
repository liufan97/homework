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
		System.out.println("��������ѡ��ʽ");
		System.out.println("1.��");
		System.out.println("2.��");
		System.out.println("3.��");
		System.out.println("4.��");
		System.out.println("5.�˳�");
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
				System.out.println("����������������������");
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
			System.out.println("�Ƿ��������\n��������1��������2");
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
		System.out.println("1.��ȷ��ѯ\t2ȫ����ѯ");
		int cc = z.nextInt();
		if(cc == 1){
			System.out.println("����Ҫ��ѯ������");
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
		System.out.println("�Ƿ������ѯ ������1�� ��2��");
		int jx = z.nextInt();
		if(jx==1){
			cha();
		}else{
			dh();
		}
	}
	//}
	public static void gai(){
		System.out.println("������Ҫ���µ�ѧ������");
		String mz = z.next();
		for(int i=0;i<zm.length;i++){
			if(zm[i]!= null && mz.equals(zm[i].name)){
				zm[i] = null;
				System.out.println("��������");
				String name = z.next();
				System.out.println("��������");
				int age = z.nextInt();
				System.out.println("�����Ա�");
				char sex = z.next().charAt(0);
				Xues1 s1 = new Xues1(name,age,sex);
				zm[i] = s1;
			}
		}
		System.out.println("��1�� ���� ��2�� ��������");
		int gx = z.nextInt();
		if(gx==1){
			dh();
		}else{
			gai();
		}
	}
	public static void shan(){
		System.out.println("������Ҫɾ����ѧ������");
		String sc = z.next();
		for(int i=0;i<zm.length;i++){
			if(zm[i]!= null && zm[i].name.equals(sc)){
					zm[i] = null;
			}
		}
		System.out.println("ɾ���ɹ�; 1 ���� 2 ����ɾ��");
		int c = z.nextInt();
		if(c==1){
			dh();
		}else{
			shan();
		}
	}
}