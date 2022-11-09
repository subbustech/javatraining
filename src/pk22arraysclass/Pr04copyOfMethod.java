package pk22arraysclass;

import java.util.Arrays;

public class Pr04copyOfMethod {

public static void main(String[] args) {
		
		Integer[] arr1 = {1, 8, 2, 6, 3, 4, 9, 5};
		
		Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);

		System.out.println(Arrays.toString(arr2));
		
		Integer[] arr3 = Arrays.copyOf(arr1, arr1.length-3);

		System.out.println(Arrays.toString(arr3));
	}

}
