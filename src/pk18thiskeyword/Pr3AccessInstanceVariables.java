package pk18thiskeyword;

public class Pr3AccessInstanceVariables {

	int a;
	int b;
	public void assign(int a, int b) {
		this.a = a;
		this.b = b; 
	}
	public static void main(String[] args) {
		
		Pr3AccessInstanceVariables tk = new Pr3AccessInstanceVariables();
		
		tk.assign(5,6);
		
		System.out.println("A value is "+tk.a);
		System.out.println("B value is "+tk.b);
	}
}
