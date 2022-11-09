package pk20strings;

public class Pr07EqualIgnoreCase {

	public static void main(String[] args) {

		String str1 = new String("SELENIUM TUTORIALS");

		String str2 = new String("Selenium Tutorials");

		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Both strings are equal");
		}
		else {
			System.out.println("The strings are not equal");
		}

	}

}
