package pk20strings;

public class Pr01CreatingString {

public static void main(String[] args) {
		
		//First way - Using Character Array
		char[] ch = {'H','e','l','l','o','1'};
		String str1 = new String(ch);
		
		//Second way - Using String Literal
		String str2 = "Hello2";
		
		//Third way - Using new Keyword
		String str3 = new String("Hello3");
		
		System.out.println(str1);
		
		System.out.println(str2);
		
		System.out.println(str3);
	}

}