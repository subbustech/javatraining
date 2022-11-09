package pk05methods;

public class Pr3MethodOverloadingDifferentArgumentTypes {

	public static void details(int a, int b) {
		System.out.println("a is "+a+" b is "+b);
	}
	public static void details(String a, String b) {
		System.out.println("a is "+a+" b is "+b);
	}
	public static void main(String[] args) {
		details(20, 30);
		details("Venkat", "Ganesh");
	}

}
