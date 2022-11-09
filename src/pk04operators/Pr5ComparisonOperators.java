package pk04operators;

public class Pr5ComparisonOperators {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		if(num1 == num2) {
			System.out.println("Both values are equal");
		}
		
		if(num1 != num2) {
			System.out.println("The values are not equal");
		}
		
		if(num1 > num2) {
			System.out.println("Num1 is greater than Num2");
		}
		
		if(num1 < num2) {
			System.out.println("Num1 is less than Num2");
		}
		
		if(num1 >= num2) {
			System.out.println("Num1 is greater than or equal to Num2");
		}
		
		if(num1 <= num2) {
			System.out.println("Num1 is less than or equal to Num2");
		}
	}

}
