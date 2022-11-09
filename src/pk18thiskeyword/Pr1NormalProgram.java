package pk18thiskeyword;

public class Pr1NormalProgram {

	static int a;
	static int b;
	public void assign(int c, int d) {
		a = c;
		b = d; 
	}
	public static void main(String[] args) {
		Pr1NormalProgram tk = new Pr1NormalProgram();
		tk.assign(5,6);
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
	}

}