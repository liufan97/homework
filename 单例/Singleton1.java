/*public class Singleton1
{

	private static final Singleton1 instance = 
	new Singleton1();// ���ڲ�׼����һ������
	
	public static Singleton1 getInstance(){//
		return instance;
	}

	//private Singleton1(){}
	public void show(){
		System.out.println("Singleton1");
	}
}*/


public class Singleton1{
	private static final Singleton1 instance = 
		new Singleton1();

	public static Singleton1 getlnstance(){
		return instance;
	}
	public void show(){}
}