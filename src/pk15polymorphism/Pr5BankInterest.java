package pk15polymorphism;

public class Pr5BankInterest {

	public static void main(String[] args) {
		
		pr1interface interest = new Pr4HDFC();
		float interestAmount = interest.getInterest(1000000);
		System.out.println(interestAmount);

	}

}
