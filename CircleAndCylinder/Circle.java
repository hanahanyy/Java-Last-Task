
public class Circle {
	double radius = 1.0;
	String color = "red";
	
	public  Circle () {
		
	}
	
	public  Circle (double radius, String color) {
		this.radius=radius;
		this.color=color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "The area is: " + getArea() +"\n"+"The color is: "+ getColor();
	}
	
	public double getArea() {
		double Area = 3.14*radius*radius;
		return Area;
		
		
	}
	
	

}
