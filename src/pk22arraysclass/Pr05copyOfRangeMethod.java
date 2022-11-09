package pk22arraysclass;

import java.util.Arrays;

public class Pr05copyOfRangeMethod {

public static void main(String[] args) {
		
		Integer[] arr1 = {1, 8, 2, 6, 3, 4, 9, 5};
		
		Integer[] arr2 = Arrays.copyOfRange(arr1, 1, 4);

		System.out.println(Arrays.toString(arr2));
	}

}
