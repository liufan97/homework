public class Student{
	//声明类的属性信息
	 String name;//姓名
	 int age;//年龄
	 char sex;//性别
	//声明类的动作信息
	public void eat(){
		System.out.println("Eating");
	}
	public void sleep(){
		System.out.println("sleeping");
	}
	public void play(){
		System.out.println("Playing Games");
	}
	public void study(){
		System.out.println("study");
	}
	//构造器
	public Student(String name,int age,char sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	//基本信息输出
	public  void say(){
		System.out.println("我叫"+name+"，今年"+age+"岁,"+"我是一个"+sex+"孩儿");
	}
	//static的调用
	static int  numbers = 5;
}