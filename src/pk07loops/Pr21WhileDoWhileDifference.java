package pk07loops;

public class Pr21WhileDoWhileDifference {

	public static void main(String[] args) {

		int j = 5;

		//While Loop Won't Execute
		while(j<3) {

			System.out.println("While Loop - Value of j is "+j);

		}

		//Do While Loop Executes Once
		do {

			System.out.println("Do While Loop - Value of j is "+j);

		}while (j<3);


	}

}
