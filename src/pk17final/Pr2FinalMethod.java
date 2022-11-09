package pk17final;

class ParentClass {

	public final void methodA() {
		System.out.println("This is final method");
	}
}

public class Pr2FinalMethod extends ParentClass{

	public final void methodA() { //Error: Cannot override the final method from ParentClass
		System.out.println("Final method can't be overridden");
	}
	public static void main(String[] args) {
		

	}
}