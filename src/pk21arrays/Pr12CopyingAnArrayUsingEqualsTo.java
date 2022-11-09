package pk21arrays;

import java.util.Arrays;

public class Pr12CopyingAnArrayUsingEqualsTo {

	public static void main(String[] args) {

		String arr1[] = {"subbu", "selenium", "java", "tutorials"};

		String arr2[] = new String[5];

		arr2 = arr1;

		arr2[2] = "hello";

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

}
