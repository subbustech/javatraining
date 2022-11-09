package pk21arrays;

public class Pr04PassingArrayToAMethod {

	public static int findMax(int arr[]) {
		int max = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		int testarray[] = {5,33,65,43,67,34};
		int maxvalue = findMax(testarray);
		System.out.println("Max. Value is "+maxvalue);
	}

}
