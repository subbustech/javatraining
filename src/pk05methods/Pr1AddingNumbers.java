package pk05methods;

public class Pr1AddingNumbers {

	public int add(int a, int b) {
		int c = a+b;	
		return c;
	}
	public static void main(String[] args) {
	
		int a = 2;
		int b = 2;
		Pr1AddingNumbers an = new Pr1AddingNumbers();
	
		System.out.println(an.add(a,b));
	}

}