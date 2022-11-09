package pk19superkeyword;

class ParentClass1 {
	
	ParentClass1(){
		System.out.println("Parent class no-arg constructor");
	}
	ParentClass1(int value){
		System.out.println("Parent class constructor with argument "+value);
	}
}


public class Pr2AccessParentClassConstructor extends ParentClass1{
	Pr2AccessParentClassConstructor(){
		super(100);
		System.out.println("I am child class constructor");
	}
	public static void main(String[] args) {
		Pr2AccessParentClassConstructor cl = new Pr2AccessParentClassConstructor();
	}

}