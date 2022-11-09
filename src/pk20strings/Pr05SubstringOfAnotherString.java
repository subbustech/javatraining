package pk20strings;

public class Pr05SubstringOfAnotherString {
	static String str1 = "subbu";
	static String str2 = "subbu selenium tutorials";

	public static void main(String[] args) {
		if(str2.indexOf(str1) != -1) {
			System.out.println("1st Method: str2 is substring of str1");
		}
		else {
			System.out.println("1st Method: str2 is NOT substring of str1");
		}

		if(str2.contains(str1)) {
			System.out.println("2nd Method: str2 is substring of str1");
		}
		else {
			System.out.println("2nd Method: str2 is NOT substring of str1");
		}

	}

}