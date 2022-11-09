package pk12Inheritance;

public class Pr2ConstructorsAndInheritanceParentClass {

	String name = "Venkat";
	String role = "Manager";
	String company = "IBM";
	Pr2ConstructorsAndInheritanceParentClass(){
		System.out.println("Parent Class Constructor");
	}
	public static void displayDetails() {
		Pr2ConstructorsAndInheritanceParentClass pc = new Pr2ConstructorsAndInheritanceParentClass();
		System.out.println("Name is "+pc.name);
		System.out.println("Role is "+pc.role);
		System.out.println("Company is "+pc.company);
	}

}
