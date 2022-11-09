package pk18thiskeyword;

public class Pr2NormalProgram {

	int a;
	int b;
	public void assign(int a, int b) {
		a = a;
		b = b; 
	}
	public static void main(String[] args) {
		Pr2NormalProgram tk = new Pr2NormalProgram();
		tk.assign(5,6);
		System.out.println("A value is "+tk.a);
		System.out.println("B value is "+tk.b);
	}

}
