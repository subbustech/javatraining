package pk06conditionsswitchcase;

public class Pr02NestedIf {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		int num3 = 2;
		if(num1 > num2) {
			if(num2 > num3) {
				System.out.println("True");
			}
		}
	}

}
