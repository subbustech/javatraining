package pk22arraysclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pr02AsListMethod {

	public static void main(String[] args) {

		Integer[] arr1 = {1, 2, 3, 4, 5};
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(arr1));

		System.out.println(l1);

		l1.add(6);

		System.out.println(l1);

	}

}
