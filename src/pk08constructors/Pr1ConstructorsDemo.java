package pk08constructors;

public class Pr1ConstructorsDemo {

	int age;
	String name;
	Pr1ConstructorsDemo(){
		this.age = 10;
		this.name = "Subbu";
	}
	Pr1ConstructorsDemo(int age, String name){
		this.age = age;
		this.name = name;
	}
	public static void main(String[] args) {
		Pr1ConstructorsDemo cd1 = new Pr1ConstructorsDemo();
		System.out.println("Age is "+cd1.age);
		System.out.println("Name is "+cd1.name);
		
		Pr1ConstructorsDemo cd2 = new Pr1ConstructorsDemo(15, "Venkat");
		System.out.println("Age is "+cd2.age);
		System.out.println("Name is "+cd2.name);
	}

}
