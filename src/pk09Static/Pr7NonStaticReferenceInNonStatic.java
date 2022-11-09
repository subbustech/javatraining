package pk09Static;

public class Pr7NonStaticReferenceInNonStatic {

	public static void main(String[] args)
	{
		Pr7NonStaticReferenceInNonStatic pr4 = new Pr7NonStaticReferenceInNonStatic();
		pr4.welcome();
	}    
	
	void showWelcome() {
		
		welcome();
	}
	
	void welcome()
	{
		System.out.println("Welcom to Java Tutorials");
	}

}
