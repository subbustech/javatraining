package pk23collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;

public class Pr04IteratingOverAList {

	public static void main(String[] args) {
//		//Using Advanced For Loop
//
//		//Declaring an arraylist
//		ArrayList<String> a = new ArrayList<String>();
//
//		//Adding elements to array list
//		a.add("Subbu");
//		a.add("Raghu");
//		a.add("Venu");
//		a.add("Rajesh");
//
//		//Iterating through the list
//		for(String s:a) {
//			System.out.println(s);
//		}


		//Using Iterator
		//Declaring an arraylist
		ArrayList<String> a = new ArrayList<String>();

		//Adding elements to array list
		a.add("Subbu");
		a.add("Raghu");
		a.add("Venu");
		a.add("Rajesh");

		//Iterating through the list
		Iterator itr = a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
