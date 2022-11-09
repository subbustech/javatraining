package pk14Interfaces;

public class Pr2ClassForInterface implements Pr1Interface{

	public void test1() {
		System.out.println("Implementing test1");
	}
	public void test2() {
		System.out.println("Implementing test2");
	}
	public static void main(String[] args) {
		Pr1Interface cl = new Pr2ClassForInterface();
		cl.test1();
		cl.test2();
	}

}
