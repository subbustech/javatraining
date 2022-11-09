package pk07loops;

public class Pr10NestedWhileLoop {

public static void main(String[] args) {
		
		int j = 0;
		
		while (j<3) {
			
			System.out.println(" j value is "+j);
			
			int k = 0;
			
			while (k<3) {
				
				System.out.println(" -- k value is "+k);
				
				k++;
			}
			
			j++;
		}	

	}

}
