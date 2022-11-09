package pk24collectionsclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pr05disjointMethod {

public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(4, 3, 5, 2, 1, 6));
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(50, 11, 10, 9, 8));
		System.out.println(Collections.disjoint(l1, l2));
		
	}

}
