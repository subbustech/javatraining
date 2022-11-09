package pk13abstraction;

public class Pr2ChildParrot extends Pr1ParentBird{
	public static void main(String[] args) {
		String flystring = fly();
		Pr2ChildParrot p = new Pr2ChildParrot();
		p.color();
		System.out.println(flystring);
	}
	public void color() {
		System.out.println("My color is green");
	}

}