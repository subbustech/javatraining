package pk24collectionsclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pr13minMethodInReverseOrder {

public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(4, 3, 5, 2, 1, 6));
		
		System.out.println(Collections.min(l1, Collections.reverseOrder()));
		
	}

}
