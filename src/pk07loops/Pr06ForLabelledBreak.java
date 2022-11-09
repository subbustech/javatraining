package pk07loops;

public class Pr06ForLabelledBreak {

	public static void main(String[] args) {
		
		outer:	for (int i=0; i<10; i++) {
					
					System.out.println("i value is "+i);
					
					for(int j=50; j<53; j++) {
						if (i == 5) {
							break outer;
						}
						System.out.println(" -- j value is "+j);
					}
					
				}

			}

}
