package pk11AccessModifiers;

import pk10AccessModifiers.FirstProgram;

public class ThirdProgram {

	public static void main(String[] args) {
		System.out.println("Calling FirstProgram in package pk10AccessModifiers");
		FirstProgram fp = new FirstProgram();
		System.out.println("x value is: "+fp.x);
		int c = fp.sum(5, 5);
		System.out.println("Sum is "+c);
	}

}
