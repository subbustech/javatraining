package pk22arraysclass;

import java.util.Arrays;

public class Pr11sortFromIndexToIndex {

public static void main(String[] args) {
		
		int[] arr1 = {1, 8, 2, 6, 3, 4, 9, 5};
		
		Arrays.sort(arr1, 1, 6);
		
		System.out.println(Arrays.toString(arr1));
	}

}
