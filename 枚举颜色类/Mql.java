enum Color{
	RED,GREEN,BLUE;

	public String toString(){
		String ret = super.toString();
		switch(this){
		case RED:
			ret = "hong";
			break;
		case GREEN:
			ret = "��ɫ";
			break;
		case BLUE:
			ret = "��ɫ";
			break;
		default:
			ret = "û�������ɫ";
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