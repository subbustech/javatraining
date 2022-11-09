package pk07loops;

public class Pr08ForLabelledContinue {

	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
				
				System.out.println("i value is "+i);
				
				for(int j=50; j<53; j++) {
					if (i == 5) {
						continue;
					}
					System.out.println(" -- j value is "+j);
				}
				
			}

		}

}
