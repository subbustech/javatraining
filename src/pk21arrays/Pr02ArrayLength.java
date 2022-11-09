package pk21arrays;

public class Pr02ArrayLength {

	public static void main(String[] args) {
		int testarray[] = new int[5];
		testarray[0] = 1;
		testarray[1] = 2;
		testarray[2] = 3;
		testarray[3] = 4;
		testarray[4] = 5;
		
		System.out.println("Array length is "+testarray.length);
		
		for(int i=0; i<testarray.length; i++) {
			System.out.println(testarray[i]);
		}
	}

}
