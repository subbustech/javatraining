package pk15polymorphism;

public class Pr2ICICI implements pr1interface{

	@Override
	public float getInterest(float amount) {
		float interestRate = 0.095f;
		return (float) (interestRate * amount);
	}

}
