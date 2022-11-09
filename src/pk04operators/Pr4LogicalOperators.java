package pk04operators;

public class Pr4LogicalOperators {

	public static void main(String[] args) {
		int num1 = -10;
		int num2 = -5;
		boolean test = false;
		if(num1 > 0 && num2 >0) {
			System.out.println("Both values are greater than 0");
		}
		else if(num1 > 0 || num2 > 0) {
			System.out.println("One of the values is greater than 0");
		}
		else {
			System.out.println("Both values are less than 0");
		}
		if(test) {
			System.out.println("It is true");
		}
		if(!test) {
			System.out.println("It is false");
		}
	}

}