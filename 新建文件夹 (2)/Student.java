public class Student{
	//�������������Ϣ
	 String name;//����
	 int age;//����
	 char sex;//�Ա�
	//������Ķ�����Ϣ
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
	//������
	public Student(String name,int age,char sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	//������Ϣ���
	public  void say(){
		System.out.println("�ҽ�"+name+"������"+age+"��,"+"����һ��"+sex+"����");
	}
	//static�ĵ���
	static int  numbers = 5;
}