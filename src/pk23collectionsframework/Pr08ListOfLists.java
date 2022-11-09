package pk23collectionsframework;

import java.util.ArrayList;
import java.util.List;

public class Pr08ListOfLists {

	public static void main(String[] args) {
		List<List<String>> lls = new ArrayList<List<String>>();

		List<String> ls = new ArrayList<String>();
		ls.add("subbu");
		ls.add("selenium");
		lls.add(ls);
		
		List<String> ls1 = new ArrayList<String>();
		ls1.add("java");
		ls1.add("tutorials");
		lls.add(ls1);
		
		System.out.println(lls);
		
		for(int i=0; i<lls.size(); i++) {
			System.out.println(lls.get(i).get(0));
			System.out.println(lls.get(i).get(1));
		}

	}

}
