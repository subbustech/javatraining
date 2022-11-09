package pk07loops;

public class Pr16NestedDoWhileLoop {

	public static void main(String[] args) {

		int j = 0;

		do {

			System.out.println(" j value is "+j);
			int k = 0;
			do {
				System.out.println(" -- k value is "+k);
				k++;
			}while (k<3);
			j++;

		}while (j<3);

	}

}
