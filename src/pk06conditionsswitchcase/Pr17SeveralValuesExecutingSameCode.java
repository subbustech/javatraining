package pk06conditionsswitchcase;

public class Pr17SeveralValuesExecutingSameCode {

public static void main(String [] args){ 
		
		int month = 4;
		
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:				
				System.out.println("No. of days are "+31);
				break;
			case 2:
				System.out.println("No. of days are "+28);
				break;
			default:
				System.out.println("No. of days are "+30);
		}
	
	}

}
