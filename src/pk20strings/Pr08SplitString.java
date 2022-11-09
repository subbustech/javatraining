package pk20strings;

public class Pr08SplitString {

public static void main(String[] args) {
		
		String str1 = new String("Selenium Tutorials by subbu");
		
		String[] arr1 = str1.split(" ");
		
		System.out.println("length of array is "+arr1.length);
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
