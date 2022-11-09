package pk22arraysclass;

import java.util.Arrays;

public class Pr03binarySearchMethod {

public static void main(String[] args) {
		
		Integer[] arr1 = {1, 8, 2, 6, 3, 4, 9, 5};
		
		Arrays.sort(arr1);
		
		if(Arrays.binarySearch(arr1, 23) >= 0) {
			System.out.println("Element exists in the array");
		}
		else {
			System.out.println("Element doesn't exist in the array");
		}

	}

}
