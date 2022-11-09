package pk23collectionsframework;

import java.util.HashMap;
import java.util.Map;

public class Pr13MapOfMaps {

	public static void main(String[] args) {
		Map<String, Map<String, String>> mpmp= new HashMap<String, Map<String, String>>();
		
		Map<String, String> mp = new HashMap<String, String>();
		
		mp.put("name", "Subbu");
		mp.put("role", "test manager");
		
		mpmp.put("1", mp);
		
		System.out.println(mpmp);
		
		Map<String, String> mp1 = new HashMap<String, String>();
		
		mp1.put("name", "Venkat");
		mp1.put("role", "test lead");
		
		mpmp.put("2", mp1);
		
		System.out.println(mpmp);
		
		System.out.println(mpmp.get("1"));
		System.out.println(mpmp.get("2"));
		
		System.out.println(mpmp.get("1").get("name"));
		System.out.println(mpmp.get("1").get("role"));
		
		System.out.println(mpmp.get("2").get("name"));
		System.out.println(mpmp.get("2").get("role"));
	}

}
