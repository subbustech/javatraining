package pk05methods;

public class Pr4MethodOverloadingDifferentSequence {

	public static void details(int age, String name) {
		System.out.println("Age is "+age+" Name is "+name);
	}
	public static void details(String name, int age) {
		System.out.println("Age is "+age+" Name is "+name);
	}
	public static void main(String[] args) {
		details(20, "Venkat");
		details("Ganesh", 22);
	}

}
