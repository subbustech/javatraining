package pk17final;

public class Pr1FinalVariable {

	final String str = "Subbu's Selenium Tutorials";
	public static void main(String[] args) {

		Pr1FinalVariable fke = new Pr1FinalVariable();
		System.out.println("Final variable a is "+ fke.str);

		fke.str = "Java and selenium tutorials"; //Error: The final field Pr1FinalVariable.str cannot be assigned

	}

}
