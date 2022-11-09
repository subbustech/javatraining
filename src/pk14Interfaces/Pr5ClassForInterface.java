package pk14Interfaces;

public class Pr5ClassForInterface implements Pr4Interface{

	public void test1() {
		System.out.println("Implementing test1");
	}
	public void test2() {
		System.out.println("Implementing test2");
	}
	public void test3() {
		System.out.println("Implementing test3");
	}
	public void test4() {
		System.out.println("Implementing test4");
	}
	public static void main(String[] args) {
		Pr4Interface cl = new Pr5ClassForInterface();
		cl.test1();
		cl.test2();
		cl.test3();
		cl.test4();
	}

}
