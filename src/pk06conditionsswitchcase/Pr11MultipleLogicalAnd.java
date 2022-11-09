package pk06conditionsswitchcase;

public class Pr11MultipleLogicalAnd {

	public static void main(String [] args){ 
		int a = 5;
		int b = 8;
		int c = 10;
		int d = 20;

		if(a < b && a < c && a < d) {
			System.out.println("a is less than b and c and d");
		}
		else {
			System.out.println("a may be greater than b or c or d");
		}
	
	}

}
