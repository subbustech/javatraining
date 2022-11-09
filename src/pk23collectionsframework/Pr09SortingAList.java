package pk23collectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pr09SortingAList {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("subbu");
		ls.add("selenium");
		ls.add("java");
		ls.add("tutorials");
		
		System.out.println(ls);
		
		//In Ascending order
		Collections.sort(ls);
		//In descending order
		//Collections.sort(ls, Collections.reverseOrder());
		
		System.out.println(ls);
		
	}

}
