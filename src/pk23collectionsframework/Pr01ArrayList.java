package pk23collectionsframework;

import java.util.ArrayList;

public class Pr01ArrayList {
	public static void main(String[] args) {
		//Declaring an arraylist
		ArrayList a = new ArrayList();
		
		//Adding elements to array list
		a.add("Subbu");
		a.add("Raj");
		a.add("Krishna");
		a.add("Vishnu");
		a.add("Raghu");
		
		//Getting elements from arraylist
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		
		//Getting the number of elments in an arraylist
		System.out.println(a.size());
		
		//Printing an arraylist
		System.out.println(a);
		
		//Removing an elements from an array list
		a.remove("Vishnu");
		
		System.out.println(a.size());
		System.out.println(a);
		
		//Removing an elements by index
		a.remove(2);
		
		System.out.println(a.size());
		System.out.println(a);
		
		//Checking if an array list contains a value
		System.out.println("Contains Vishnu "+a.contains("Vishnu"));
	}

}
