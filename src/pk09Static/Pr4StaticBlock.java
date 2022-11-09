package pk09Static;

public class Pr4StaticBlock {

	static int num;
	static String text;
	static {
		System.out.println("Initiating variables in block 1");
		num = 10;
		text = "hello";
	}
	static {
		System.out.println("Initiating variables in block 2");
		num = 11;
		text = "hello2";
	}
	public static void main(String[] args) {
		System.out.println("Value of num is "+num);
		System.out.println("Value of text is "+text);
	}

}