package pk21arrays;

import java.util.Arrays;

public class Pr11SearchingAnArray {

	public static void main(String[] args) {

		String arr1[] = {"subbu", "java", "selenium", "tutorials"};

		Arrays.sort(arr1);

		System.out.println(Arrays.binarySearch(arr1,"subbu"));

	}

}
