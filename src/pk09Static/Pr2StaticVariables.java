package pk09Static;

public class Pr2StaticVariables {

	static int a =10;
	public static void main(String args[]){
		Pr2StaticVariables s1 = new Pr2StaticVariables();
		Pr2StaticVariables s2 = new Pr2StaticVariables();
		System.out.println("s1.a value :"+s1.a);
		System.out.println("s2.a value :"+s2.a);
		//Change s1 a value alone
		s1.a=20;
		System.out.println("s1.a value :"+s1.a);
		System.out.println("s2.a value :"+s2.a);
	}

}
