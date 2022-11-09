package pk07loops;

public class Pr02NestedForLoops {

public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			System.out.println("I am outside loop");
			for(int j=0; j<5; j++) {
				System.out.println(" -- I am inside loop");
			}
		}

	}

}
