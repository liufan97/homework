public class Chaoshi{
	
	String sname;	//��Ʒ��
	String lx;		//����
	int jg;		//�۸�
	int sl;	//ʣ������
	public static void main(String[] args){
		Chaoshi1.caidan();
	}
	public Chaoshi(String sname,String lx,int jg,int sl){
		this.sname=sname;
		this.lx=lx;
		this.jg=jg;
		this.sl=sl;
	}
	public void shuchu(){
		System.out.println("��Ʒ��"+sname+"������"+lx+"�۸�"+jg+"ʣ������"+sl);
	}
}