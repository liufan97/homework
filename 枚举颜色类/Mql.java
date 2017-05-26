enum Color{
	RED,GREEN,BLUE;

	public String toString(){
		String ret = super.toString();
		switch(this){
		case RED:
			ret = "hong";
			break;
		case GREEN:
			ret = "绿色";
			break;
		case BLUE:
			ret = "蓝色";
			break;
		default:
			ret = "没有这个颜色";
		}
		return ret;
	} 
}

public class Mql
{
	public static void main(String[] arge){
		Color[] cl = Color.values();
		for(Color c : cl){
			System.out.println(c);
		}
	}
}