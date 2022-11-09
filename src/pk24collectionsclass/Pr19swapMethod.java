package pk24collectionsclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pr19swapMethod {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

		Collections.swap(l1, 1, 2);

		System.out.println(l1);
	}

}
