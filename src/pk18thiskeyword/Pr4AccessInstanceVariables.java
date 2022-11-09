package pk18thiskeyword;

public class Pr4AccessInstanceVariables {

	int a;
	int b;
	public Pr4AccessInstanceVariables(int a, int b) {
		this.a = a;
		this.b = b; 
	}
	public static void main(String[] args) {
		
		Pr4AccessInstanceVariables tk = new Pr4AccessInstanceVariables(10, 20);
		
		System.out.println("A value is "+tk.a);
		System.out.println("B value is "+tk.b);
	}
}
