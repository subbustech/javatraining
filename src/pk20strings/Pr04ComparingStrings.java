package pk20strings;

public class Pr04ComparingStrings {

	public static void main(String[] args) {
		//Test 1
		String strtest1 = "hi";
		String strtest2 = "hi";
		if(strtest1 == strtest2) {
			System.out.println("Test1: Both are equal");
		}
		else {
			System.out.println("Test1: Both are not equal");
		}
		
		//Test 2
		String strtest3 = new String("hi");
		String strtest4 = new String("hi");
		if(strtest3==strtest4) {
			System.out.println("Test2: Both are equal");
		}
		else {
			System.out.println("Test2: Both are not equal");
		}
		
		//Test 3
		String strtest5 = new String("hi");
		String strtest6 = new String("hi");
		if(strtest5.equals(strtest6)) {
			System.out.println("Test3: Both are equal");
		}
		else {
			System.out.println("Test3: Both are not equal");
		}
	}

}
