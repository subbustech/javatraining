package pk24collectionsclass;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Pr18sortMethod {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(67, 34, 12, 87, 97, 44));

		Collections.sort(l1);

		System.out.println(l1);

		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(67, 34, 12, 87, 97, 44));

		Collections.sort(l2, Collections.reverseOrder());

		System.out.println(l2);
	}

}
