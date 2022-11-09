package pk20strings;

public class Pr09CheckIfAStirngIsEmpty {

public static void main(String[] args) {
		
		String str1 = new String("");

		if(str1.isEmpty()) {
			System.out.println("usign isEmpty() - The string is empty");
		}
		
		if(str1.length() == 0) {
			System.out.println("using length() - The string is empty");
		}
	}

}
