package pk20strings;

public class Pr02StringMethods {

	public static void main(String[] args) {

		String strtest1 = "hello hi";

		//Length of string
		System.out.println("Lenght of string is "+strtest1.length());

		//Index of a character or a substring
		System.out.println("Index of l is "+strtest1.indexOf("l"));
		System.out.println("Index of hi is "+strtest1.indexOf("hi"));

		//Character at a particular index
		System.out.println("Character at 3rd index "+strtest1.charAt(3));

		//Check if a string contains a substring
		System.out.println("Does the string contain hi? "+strtest1.contains("hi"));

		//Check if a string ends with something
		System.out.println(("Does the string ends with i? " + strtest1.endsWith("i")));
		System.out.println(("Does the string ends with hi? " + strtest1.endsWith("hi")));

		//Replace, ReplaceAll, ReplaceFirst
		String strtest2 = "hi hi hi hi";
		System.out.println("Replacing hi with hello: "+strtest2.replace("hi", "hello"));
		System.out.println("Replacing hi with hello: "+strtest2.replaceFirst("hi", "hello"));
		System.out.println("Replacing hi with hello: "+strtest2.replaceAll("hi", "hello"));

		//toLowerCase and toUpperCase
		String strtest3 = "HelLo Hi";
		System.out.println("All Upper Case Letters: "+strtest3.toUpperCase());
		System.out.println("All Lower Case Letters: "+strtest3.toLowerCase());

		//Substring
		String str = new String("Selenium Tutorials");
		System.out.println(str.substring(9));
		System.out.println(str.substring(9,14));

		//Concatenation
		String strtest5 = "hi";
		String strtest6 = "hello";
		
		String strtest7 = strtest5 + strtest6;
		System.out.println(strtest7);
		
		String strtest8 = strtest5.concat(strtest6);
		System.out.println(strtest8);

	}

}
