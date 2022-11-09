package pk24collectionsclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pr02addAllMethod {

	public static void main(String[] args) {
	
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(4, 3, 5));
		
		System.out.println(l1);
		
		Collections.addAll(l1, 1, 2, 3);
		
		System.out.println(l1);
	}

}
