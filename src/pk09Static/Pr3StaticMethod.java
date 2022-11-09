package pk09Static;

public class Pr3StaticMethod {

	// This is a static method
	//void myMethod()
	static void myMethod() 
	{
		System.out.println("myMethod");
	}

	public static void main(String[] args)
	{
		/* You can see that we are calling this
		 * method without creating any object. 
		 */
		//StaticMethod s = new StaticMethod();
		//s.myMethod();
		myMethod();
	}

}
