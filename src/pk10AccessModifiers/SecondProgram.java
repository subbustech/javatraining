
package pk10AccessModifiers;

public class SecondProgram {

	public static void main(String[] args) {
		
		System.out.println("Calling First Program in same package");
		
		
		FirstProgram fp = new FirstProgram();
		
		System.out.println("x value is: "+fp.x);
		
		int a = 5;
		int b = 7;
		int c;
		
		c = fp.sum(a, b);
		
		System.out.println("Sum is "+c);
	}

}
