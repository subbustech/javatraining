package pk24collectionsclass;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Pr04copyMethod {

public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(4, 3, 5, 2, 1, 6));
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(12, 11, 10, 9, 8, 9));
		System.out.println(l1);
		System.out.println(l2);
		
		Collections.copy(l2,  l1);
		System.out.println(l1);
		System.out.println(l2);
		
		l2.set(0, 1);
		System.out.println(l1);
		System.out.println(l2);
		
	}

}
