package pk09Static;

public class Pr8PrintBeforeCallingMainMethod {

	static {
		System.out.println("static block");
	}
	public static void main(String[] args) {
		System.out.println("main method");
	}

}
