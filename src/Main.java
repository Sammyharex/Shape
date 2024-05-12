import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("select shape:");
		System.out.println("1. Triangle");
		System.out.println("2. Circle");
		System.out.println("3. Rectangle");
		System.out.println("4. Sphere");
		System.out.println("5. Cube");
		
		int preference = scanner.nextInt();
		Shape shape = null;
		
		switch(preference) {
		case 1:
			System.out.println("Enter base and height of the triangle:");
			double base = scanner.nextDouble();
			double height = scanner.nextDouble();
			shape = new Triangle(base,height);
			break;
		case 2:
			System.out.println("Enter radius of the circle");
			double radius = scanner.nextDouble();
			shape = new Circle(radius);
			break;
		case 3:
			System.out.println("Enter length and breadth of the rectangle");
			double length = scanner.nextDouble();
			double breadth = scanner.nextDouble();
			shape = new Rectangle(length,breadth);
			break;
		case 4:
			System.out.println("Enter radius of the sphere");
			double sphereRadius = scanner.nextDouble();
			shape = new Sphere(sphereRadius);
			break;
		case 5:
			System.out.println("Enter side length of the cube");
			double Cubeside = scanner.nextDouble();
			shape = new Cube(Cubeside);
			break;
		default:
			System.out.println("invalid preference.");
			break;
		}
		if(shape!=null) {
			System.out.println("Area:"+ shape.calculateArea());
			if(shape instanceof ThreeDimensionalShape) {
				 ThreeDimensionalShape  threeDShape = (ThreeDimensionalShape) shape;
				 System.out.println("Volume:"+threeDShape.calculateVolume());
			}
		}
		scanner.close();
	}
}
