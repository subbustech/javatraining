package pk19superkeyword;

class ParentClass {
	int age = 20;
	String name = "Venkat";
}

public class Pr1AccessParentClassVariables extends ParentClass{

	int age = 25;
	String name = "Ganesh";
	
	public void displayDetails() {
		System.out.println(super.age);
		System.out.println(super.name);
	}
	public static void main(String[] args) {
		Pr1AccessParentClassVariables pr1 = new Pr1AccessParentClassVariables();
		pr1.displayDetails();
	}
}
