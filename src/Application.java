
public class Application {

	public static void main(String[] args) {
	
		Circle c = new Circle();
		c.setRadius(45);
		c.calculateArea();
		System.out.printf("The radius is %.2f%nThe area is %.2f", c.getRadius(), c.calculateArea());
		
	}// end main

}// end class
