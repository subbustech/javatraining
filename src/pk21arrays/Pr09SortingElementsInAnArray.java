package pk21arrays;

import java.util.Arrays;

public class Pr09SortingElementsInAnArray {

public static void main(String[] args) {
		
		String arr1[] = {"subbu", "selenium", "java", "tutorials"};
		
		Arrays.sort(arr1);
		
		for (int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		int arr2[] = {5,3,6,4,8,7,2,1,10,9};
		Arrays.sort(arr2);
		
		System.out.println(Arrays.toString(arr2));
		
	}

}
