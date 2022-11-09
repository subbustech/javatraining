package pk06conditionsswitchcase;

public class Pr18SwitchCaseWithOutBreak {

public static void main(String [] args){ 
		
		String a = "three";
		
		switch (a) {
			case "one":
				System.out.println("I am 1");
				
			case "two":
				System.out.println("I am 2");
				
			case "three":
				System.out.println("I am 3");
				
			case "four":
				System.out.println("I am 4");
				
			case "five":
				System.out.println("I am 5");
				
			case "six":
				System.out.println("I am 6");
				
			default:
				System.out.println("I am not 1 or 2 or 3 or 4 or 5 or 6");
		}
	
	}

}
