
public class Circle {
	private double radius; //instance variable/field
	
	
	public  Circle() {
		this.radius = 1.0;
	}// end of empty-argument constructor
		
	
	public  Circle(double r) {
		setRadius(r);	
	}//end preferred constructor


	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2.0);
	} // end calculateArea

	
	public double getRadius() {
		return radius;
	}// end of getRadius
	
	public void setRadius(double radius) {
		if(radius < 1.0) 
			this.radius = 1.0;
		else
			this.radius = radius;
		
	}// end of setRadius

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}// end of toString


	
} // end class
