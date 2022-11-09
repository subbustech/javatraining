package pk07loops;

public class Pr20DoWhileLabelledContinue {

	public static void main(String[] args) {

		int j = 0;

		outer: do {

			System.out.println(" j value is "+j);
			int k = 0;
			do {
				if (k>=1) {
					k++;
					j++;
					continue outer;
				}
				System.out.println(" -- k value is "+k);
				k++;
			}while (k<3);
			j++;

		}while (j<3);

	}

}
