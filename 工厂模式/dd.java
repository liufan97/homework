public class dd{
	public static void main(String [] args){
		Jiekou sss = Gongchang.gongchang("xiaomi");
		sss.dx();
	}
}

class Gongchang{
	public static Jiekou gongchang(String dx){
		Jiekou c = null;
		if("xiaomi".equals(dx)){
			c = new xiaomi();
		}else if("huawei".equals(dx)){
			c = new huawei();
		}else if("zhongxing".equals(dx)){
			c = new zhongxing();
		}
		return c;
	}
}

class xiaomi implements Jiekou{
	public void dx(){
		System.out.println("sdf");
	}
	
}
class huawei implements Jiekou{
	public void dx(){
		System.out.println("jk");
	}
}
class zhongxing implements Jiekou{
	public void dx(){
		System.out.println("jew");
	}
}
