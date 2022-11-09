package pk16propertiesclass;

public class Pr1PropertiesCl {
	public static void main(String[] args) {
		System.out.println(System.getProperties());
		System.out.println(System.getProperty("java.class.path"));
		System.setProperty("TestKey", "Hello");
		System.out.println(System.getProperty("TestKey"));
	}

}
