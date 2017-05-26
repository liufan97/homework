/*public class Singleton2 {
	private static Singleton2 instance;

	public static Singleton2 getInstance()
	{// 将instance传递到外部去
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
	private Singleton2(){}
}*/

public class Singleton2
{
	private static Singleton2 instance;

	public static Singleton2 getlnstance(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
	private Singleton2(){
		System.out.println("s");
	}
}