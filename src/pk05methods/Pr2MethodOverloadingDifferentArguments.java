package pk05methods;

public class Pr2MethodOverloadingDifferentArguments {

	public static void details(int age, String name) {
		System.out.println("Age is "+age+" Name is "+name);
	}
	public static void details(int age, int sno, String name) {
		System.out.println("Age is "+age+" S.No is "+sno+" Name is "+name);
	}
	public static void main(String[] args) {
		details(20, "Venkat");
		details(23, 123, "Ganesh");
	}

}