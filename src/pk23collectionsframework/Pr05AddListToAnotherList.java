package pk23collectionsframework;

import java.util.ArrayList;

public class Pr05AddListToAnotherList {

	public static void main(String[] args) {
		//Declaring an arraylist
		ArrayList<String> a = new ArrayList<String>();
		
		//Adding elements to array list
		a.add("Subbu");
		a.add("Raghu");
		a.add("Venu");
		a.add("Rajesh");
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("Ganesh");
		b.add("Vamshi");
		
		//Adding b list to a
		a.addAll(b);
		
		//Iterating through the list
		for(String s:a) {
			System.out.println(s);
		}
	}

}
