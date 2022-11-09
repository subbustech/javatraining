package pk03datatypes;

public class Pr2PrmitiveCasting {

	static short a =  1;
	static int b;
	
	static int c = 2;
	static short d;
	public static void main(String[] args) {
		
		//Implicit Casting or Widening Conversion
		b = a;
		
		System.out.println("b value is "+b);
		
		//d = c; //Error Can not convert from int to short
		
		//Explicit Casting or Narrowing Conversion
		d = (short) c;
		
		System.out.println("d value is "+d);
		
	}

}
