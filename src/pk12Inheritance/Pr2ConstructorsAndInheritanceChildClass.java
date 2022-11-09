package pk12Inheritance;

public class Pr2ConstructorsAndInheritanceChildClass extends Pr2ConstructorsAndInheritanceParentClass{

	Pr2ConstructorsAndInheritanceChildClass(){
		System.out.println("Child Class Constructor");
	}
	public static void main(String[] args) {
		Pr2ConstructorsAndInheritanceChildClass cl = new Pr2ConstructorsAndInheritanceChildClass();
		System.out.println("Name is "+cl.name);
		System.out.println("Role is "+cl.role);
		System.out.println("Company is "+cl.company);
	}

}
