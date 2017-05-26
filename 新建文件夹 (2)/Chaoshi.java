public class Chaoshi{
	
	String sname;	//商品名
	String lx;		//类型
	int jg;		//价格
	int sl;	//剩余数量
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
		System.out.println("商品名"+sname+"超市名"+lx+"价格"+jg+"剩余数量"+sl);
	}
}