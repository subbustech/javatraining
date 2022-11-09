package pk06conditionsswitchcase;

public class Pr13MultipleLogicalOR {

	public static void main(String [] args){ 
		int a = 21;
		int b = 8;
		int c = 10;
		int d = 20;

		if(a < b || a < c || a < d) {
			System.out.println("a is less than b and c and d");
		}
		else {
			System.out.println("a is greater than b and c and d");
		}
	
	}

}
