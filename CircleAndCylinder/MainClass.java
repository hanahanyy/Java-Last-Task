import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("choose the shape: - ");
		System.out.println("press 1 for Circle ");
		System.out.println("press 2 for Cylinder ");
		int choice = input.nextInt();
		

		
		switch (choice){
		case 1: 
			Circle c = new Circle();
			System.out.println("Enter the radius of the Circle: ");
			double radius = input.nextDouble();
			c.setRadius(radius);
			System.out.println("Enter the color of the Circle:  ");
			String color = input.next();
			c.setColor(color);
			System.out.println(c.toString());
			break;

			
		case 2:
			Cylinder cy = new Cylinder();
			System.out.println("Enter the height of the Cylinder: ");
			double Height = input.nextDouble();
			cy.setHeight(Height);
			System.out.println(cy.toString());
			break;
			
		default:
			System.out.println("Error!");

		}


	}

}
