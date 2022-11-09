package pk15polymorphism;

public class Pr4HDFC implements pr1interface{

	@Override
	public float getInterest(float amount) {
		float interestRate = 0.105f;
		return (float) (interestRate * amount);
	}
}
