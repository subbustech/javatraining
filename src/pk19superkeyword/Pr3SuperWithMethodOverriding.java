package pk19superkeyword;

class ParentClass2 {
	public void methodoverriding() {
		System.out.println("This method will be overriden");
	}
}

public class Pr3SuperWithMethodOverriding extends ParentClass2 {

	public void methodoverriding() {
		System.out.println("This method is overridden");
	}
	public void parentmethod() {
		super.methodoverriding();
	}
	public static void main(String[] args) {
		Pr3SuperWithMethodOverriding cl = new Pr3SuperWithMethodOverriding();
		cl.parentmethod();
	}

}