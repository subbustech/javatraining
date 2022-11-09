package pk15polymorphism;

public class Pr3Axis implements pr1interface{

	@Override
	public float getInterest(float amount) {
		float interestRate = 0.1f;
		return (float) (interestRate * amount);
	}
}
