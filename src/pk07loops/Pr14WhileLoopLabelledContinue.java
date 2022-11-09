package pk07loops;

public class Pr14WhileLoopLabelledContinue {

	public static void main(String[] args) {

		int j = 0;

		outer: while (j<3) {

			System.out.println(" j value is "+j);

			int k = 0;

			while (k<3) {

				System.out.println(" -- k value is "+k);

				if(k>=0) {
					j++;
					continue outer;
				}
				//
				//k++;
			}

			//j++;
		}	

	}

}
