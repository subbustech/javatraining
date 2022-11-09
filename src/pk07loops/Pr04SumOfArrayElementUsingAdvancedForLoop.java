package pk07loops;

public class Pr04SumOfArrayElementUsingAdvancedForLoop {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5,6,7,8,9,10};

		int sum = 0;

		for (int item : a) {

			sum = sum + item;

		}
		System.out.println("Sum of array values is "+sum);

	}

}
