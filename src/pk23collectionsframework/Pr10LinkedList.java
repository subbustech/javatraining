package pk23collectionsframework;

import java.util.Iterator;
import java.util.LinkedList;

public class Pr10LinkedList {

public static void main(String[] args) {
		
		//Creating an object of linked list
		LinkedList<String> ll = new LinkedList<String>();
		
		//Adding elements to the linked list
		ll.add("Subbu");
		ll.add("Selenium");
		ll.add("Java");
		ll.add("Tutorials");
		ll.add("Subscribe");
		ll.add("Youtube");
		ll.add("Channel");
		
		//Printing linked list
		System.out.println(ll);
		
		//Size of linked list
		System.out.println("Size of linked list is "+ll.size());
		
		//Printing each element using for each loop
		System.out.println("Printing values using for each loop:");
		for(String str : ll) {
			System.out.println(str);
		}
		
		//Iterating through a list and printing values
		System.out.println("Printing values by iterating through the list:");
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Removing an element using value
		ll.remove("Channel");
		System.out.println(ll);
		
		//Removing an element using index
		ll.remove(5);
		System.out.println(ll);
		
		//Removing first element
		ll.removeFirst();
		System.out.println(ll);
		
		//Removing last element
		ll.removeLast();
		System.out.println(ll);
		
		//checking if the list contains a particular element
		boolean check = ll.contains("Java");
		if(check) {
			System.out.println("The list contains Java");
		}
		else {
			System.out.println("It doesn't contain Java");
		}
		
		//Get an element from the list
		String str = ll.get(1);
		System.out.println("The string at 1st index is "+str);
		
		//Setting an element in the list
		ll.set(2, "Practice");
		System.out.println(ll);
	}

}
