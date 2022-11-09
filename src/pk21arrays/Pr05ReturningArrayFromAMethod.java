package pk21arrays;

public class Pr05ReturningArrayFromAMethod {

	public static int[] returnArray() {
		int[] arr = {1,2,3,4,5};
		return arr;
	}
	
	public static void main(String[] args) {
		
		int arr[] = returnArray();
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
