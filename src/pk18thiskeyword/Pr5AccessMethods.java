package pk18thiskeyword;

public class Pr5AccessMethods {

	int a = 10;

	public void method1() {
		System.out.println("I am in method 1");
		this.method2();
	}

	public void method2() {
		System.out.println("I am method 2");
	}

	public static void main(String[] args) {	

		Pr5AccessMethods te = new Pr5AccessMethods();
		te.method1();
	}

}
