package pk12Inheritance;

public class Pr1ChildClass extends Pr1ParentClass{

	public static void main(String[] args) {
		Pr1ChildClass cl = new Pr1ChildClass();
		System.out.println("Name is "+cl.name);
		System.out.println("Role is "+cl.role);
		System.out.println("Company is "+cl.company);
	}

}
