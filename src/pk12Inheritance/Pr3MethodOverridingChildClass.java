package pk12Inheritance;

public class Pr3MethodOverridingChildClass extends Pr3MethodOverridingParentClass{
	Pr3MethodOverridingChildClass(){
		System.out.println("Child Class Constructor");
	}
	public void displayDetails() {
		System.out.println("I belong to child class");
	}
	public static void main(String[] args) {
		Pr3MethodOverridingChildClass cl = new Pr3MethodOverridingChildClass();
		cl.displayDetails();
	}
}
