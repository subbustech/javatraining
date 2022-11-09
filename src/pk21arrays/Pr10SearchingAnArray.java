package pk21arrays;

public class Pr10SearchingAnArray {

public static void main(String[] args) {
		
		String arr1[] = {"subbu", "java", "selenium", "tutorials"};
		
		String str_to_check = "Subbu";
		boolean check = false;
		
		for(int i=0; i<arr1.length; i++) {
			
			if(arr1[i].equalsIgnoreCase(str_to_check)) {
				check = true;
				break;
			}
		}
		
		if(check) {
			System.out.println(str_to_check+" is found in the array");
		}
		else {
			System.out.println(str_to_check+" is not found in the array");
		}
		
	}

}
