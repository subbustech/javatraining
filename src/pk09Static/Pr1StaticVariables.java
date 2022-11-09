package pk09Static;

public class Pr1StaticVariables {

	static int count = 0;
	
	public void count() {
		count++;
	}
	
	public int returncount() {
		return count;
	}
	
	public static void main(String[] args) {
		
		Pr1StaticVariables s1 = new Pr1StaticVariables();
		Pr1StaticVariables s2 = new Pr1StaticVariables();
		
		s1.count();
		
		int c = s1.returncount();
		int d = s2.returncount();
		
		System.out.println("Count value is "+c);
		System.out.println("Count value is "+d);
	}

}
