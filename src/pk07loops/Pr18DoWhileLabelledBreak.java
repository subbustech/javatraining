package pk07loops;

public class Pr18DoWhileLabelledBreak {

	public static void main(String[] args) {

		int j = 0;

		outer: do {

			System.out.println(" j value is "+j);
			int k = 0;
			do {
				System.out.println(" -- k value is "+k);
				k++;
				if (k==1)
					break outer;
			}while (k<3);
			j++;

		}while (j<3);

	}

}
