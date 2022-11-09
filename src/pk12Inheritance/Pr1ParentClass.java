package pk12Inheritance;

public class Pr1ParentClass {

	String name = "Venkat";
	String role = "Manager";
	String company = "IBM";
	public static void displayDetails() {
		Pr1ParentClass pc = new Pr1ParentClass();
		System.out.println("Name is "+pc.name);
		System.out.println("Role is "+pc.role);
		System.out.println("Company is "+pc.company);
	}

}
