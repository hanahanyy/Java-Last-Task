
public class Cylinder extends Circle {
	private double height = 1.0;
	
	public Cylinder () {
		
	}
	
	public Cylinder(double height, double radius) {
		setHeight(height);
		setRadius(radius);
	}
	
	public Cylinder (double radius, String color, double height) {
	    super (radius, color);
	    this.height=height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "The volume is: " + getVolume() ;
	}
	
	public double getVolume() {
		double volume = (super.getArea())*height;	
		return volume;
	}
	
	
	
	
	 
	
     

}
