package pk20strings;

public class Pr06RemoveGivenCharFromString {

	public static void main(String[] args) {

		String str = new String("Selenium Tutorials");
		
		//removing e from the above
		
		char ch = 'e';
		
		String str1 = str.replaceAll(Character.toString(ch), "");
		
		System.out.println(str1);
		
	}

}