package pk06conditionsswitchcase;

public class Pr12LogicalOR {

	public static void main(String [] args){ 
		int a = 5;
		int b = 8;
		int c = 10;

		if(a < b || a < c) {
			System.out.println("a is smaller than one of b or c");
		}
		else {
			System.out.println("a is greater than b or c");
		}
	
	}

}
