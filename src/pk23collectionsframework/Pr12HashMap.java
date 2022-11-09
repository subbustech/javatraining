package pk23collectionsframework;

import java.util.HashMap;

public class Pr12HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
		
		//Check if the map is empty
		if(hm.isEmpty()) {
			System.out.println("Map is empty");
		}
		
		//Add key value pairs to map
		hm.put("name", "Subbu");
		hm.put("role","Test Manager");
		hm.put("company", "IBM");
		
		//Printing map
		System.out.println(hm);
		
		//check if the map contains a key
		if(hm.containsKey("name")) {
			System.out.println("Map contains key name");
		}
		
		//Getting a value using key
		System.out.println(hm.get("name"));
		
		//Checking to see if map accepts duplicate key value pairs
		hm.put("name", "Subbu");
		System.out.println(hm);
		
		//Removing a key value pair (Company:IBM)
		hm.remove("company");
		System.out.println("Removed company IBM");
		System.out.println(hm);
		
		//Check to see if map contains a particular value
		if(hm.containsValue("Subbu")) {
			System.out.println("Map contains value Subbu");
		}
		
		//Removing all the key value pairs from a map
		hm.clear();
		System.out.println("Removed all key value pairs");
		System.out.println("Size of map is "+hm.size());
		
	}

}
