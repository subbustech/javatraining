package pk18thiskeyword;

public class Pr6AccessConstructor {

	int a = 10;

	Pr6AccessConstructor(){

		this("Subbus Selenium Tutorials");
		System.out.println("Normal Constructor");

	}

	Pr6AccessConstructor(String str){
		System.out.println("Parameterized constructor and paramenter is "+str);
	}

	public static void main(String[] args) {	

		Pr6AccessConstructor te = new Pr6AccessConstructor();
	}

}
