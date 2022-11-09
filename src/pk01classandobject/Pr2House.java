package pk01classandobject;

class HousePlan {

	public int bedrooms;
	public int balconies;
}

public class Pr2House {
	public static void main(String[] args) {
		HousePlan a = new HousePlan();
		a.bedrooms = 2;
		a.balconies = 1;
		
		HousePlan b = new HousePlan();
		b.bedrooms = 3;
		b.balconies = 2;
		
		System.out.println("Bedrooms in House a "+a.bedrooms);
		System.out.println("Bedrooms in House b "+b.bedrooms);
		
		System.out.println("Balconies in House a "+a.balconies);
		System.out.println("Balconies in House b "+b.balconies);
		
	}
}