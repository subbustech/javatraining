package pk23collectionsframework;

import java.util.HashSet;
import java.util.Iterator;

public class Pr11HashSet {

public static void main(String[] args) {
		
		//Creating an object of linked list
		HashSet<String> hh = new HashSet<String>();
		
		//Checking if the HashSet is Empty
		if(hh.isEmpty())
			System.out.println("The HashSet is empty");
		
		//Adding elements to the linked list
		hh.add("Subbu");
		hh.add("Selenium");
		hh.add("Java");
		hh.add("Tutorials");
		hh.add("Subscribe");
		hh.add("Youtube");
		hh.add("Channel");
		
		//Printing linked list
		System.out.println(hh);
		
		//Check if it allows duplicate values
		hh.add("Subbu");
		System.out.println(hh);
		
		//Check if it allows null values
		hh.add("");
		System.out.println(hh);
		
		//Size of Hash Set
		System.out.println("Size of HashSet is "+hh.size());
		
		//Printing each element using for each loop
		System.out.println("Printing values using for each loop:");
		for(String str : hh) {
			System.out.println(str);
		}
		
		//Iterating through a set and printing values
		System.out.println("Printing values by iterating through the set:");
		Iterator itr = hh.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Removing an element using value
		hh.remove("Channel");
		System.out.println(hh);
		
		//Removing an element using index
		hh.remove(5);
		System.out.println(hh);
		
		
		//checking if the list contains a particular element
		boolean check = hh.contains("Java");
		if(check) {
			System.out.println("The set contains Java");
		}
		else {
			System.out.println("It doesn't contain Java");
		}

	}

}
