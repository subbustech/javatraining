package pk06conditionsswitchcase;

public class Pr10LogicalAnd {

	public static void main(String [] args){ 
		int a = 5;
		int b = 8;
		int c = 10;

		if(a < b && a < c) {
			System.out.println("a is less than b and c");
		}
		else {
			System.out.println("a may be greater than b or c");
		}
	
	}

}
