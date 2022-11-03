// ------------------------------------------------------
// This solution is mostly based on solution from Xin Jie
// ------------------------------------------------------


package sce.cz2002.cz.first;

import java.util.Scanner;

public class Problem3_2 {

	public static void main(String[] args) {
		
		// ================================= 2D ===============================================
		Scanner sc = new Scanner(System.in);
		int numShapes = 0;
		int shapeChoice = 0;
		int length, width, height, base;
		double totalArea = 0;
		double totalSurfaceArea = 0;
		double totalVolumn = 0;

		System.out.println("============ Start ============");
		System.out.println("Enter the total number of shapes:");
		numShapes = sc.nextInt();

		for (int i = 0; i < numShapes; i++) {
			shapeChoice = 0;
			System.out.println("Choose class for shape " + i+1 + ":");
			System.out.println("(1. Square, 2. Rectangle, 3. Circle, 4. Triangle, 5.Sphere, 6.Pyramid, 7.Cubiod, 8.Cone, 9.Cylinder)");

			do {
				shapeChoice = sc.nextInt();
				switch (shapeChoice) {
				case 1:
					System.out.println("Enter square side: ");
					Square square = new Square(sc.nextInt());

					System.out.println(String.format("Square area is %.2f", square.getArea()));
					totalArea += square.getArea();
					break;

				case 2:
					System.out.println("Enter rectangle length: ");
					length = sc.nextInt();
					System.out.println("Enter rectangle width: ");
					width = sc.nextInt();
					Rectangle rectangle = new Rectangle(length, width);

					System.out.println(String.format("Rectangle area is %.2f", rectangle.getArea()));
					totalArea += rectangle.getArea();
					break;

				case 3:
					System.out.println("Enter circle radius: ");
					Circle circle = new Circle(sc.nextInt());

					System.out.println(String.format("Circle area is %.2f", circle.getArea()));
					totalArea += circle.getArea();
					break;
				case 4:
					System.out.println("Enter Triangle height: ");
					height = sc.nextInt();
					System.out.println("Enter triangle base: ");
					base = sc.nextInt();
					Triangle triangle = new Triangle(height, base);

					System.out.println(String.format("Triangle area is %.2f", triangle.getArea()));
					totalArea += triangle.getArea();
					break;
				case 5:
					System.out.println("Enter sphere radius:");
					Sphere sphere = new Sphere(sc.nextInt());

					System.out.println(String.format("Sphere surface area is %.2f", sphere.getSurfaceArea()));
					System.out.println(String.format("Sphere volume is %.2f", sphere.getVolume()));
					totalSurfaceArea += sphere.getSurfaceArea();
					totalVolumn += sphere.getVolume();
					break;

				case 6:
					System.out.println("Enter pyramid height:");
					height = sc.nextInt();
					System.out.println("Enter pyramid base:");
					base = sc.nextInt();
					Pyramid pyramid = new Pyramid(height, base);

					System.out.println(String.format("Pyramid surface area is %.2f", pyramid.getSurfaceArea()));
					System.out.println(String.format("Pyramid volume is %.2f", pyramid.getVolume()));
					totalSurfaceArea += pyramid.getSurfaceArea();
					totalVolumn += pyramid.getVolume();

				case 7:
					System.out.println("Enter cuboid length:");
					length = sc.nextInt();
					System.out.println("Enter cuboid width:");
					width = sc.nextInt();
					System.out.println("Enter cuboid height:");
					height = sc.nextInt();
					Cuboid cuboid = new Cuboid(length, width, height);

					System.out.println(String.format("Cuboid surface area is %.2f", cuboid.getSurfaceArea()));
					System.out.println(String.format("Cuboid volume is %.2f", cuboid.getVolume()));
					totalSurfaceArea += cuboid.getSurfaceArea();
					totalVolumn += cuboid.getVolume();
					break;

				case 8:
					System.out.println("Enter cone height:");
					height = sc.nextInt();
					System.out.println("Enter cone radius:");
					base = sc.nextInt();
					Cone cone = new Cone(base, height);

					System.out.println(String.format("Cone surface area is %.2f", cone.getSurfaceArea()));
					System.out.println(String.format("Cone volume is %.2f", cone.getVolume()));
					totalSurfaceArea += cone.getSurfaceArea();
					totalVolumn += cone.getVolume();
					break;

				case 9:
					System.out.println("Enter cylinder radius:");
					base = sc.nextInt();
					System.out.println("Enter cylinder height:");
					height = sc.nextInt();
					Cylinder cylinder = new Cylinder(base, height);

					System.out.println(String.format("Cylinder surface area is %.2f", cylinder.getSurfaceArea()));
					System.out.println(String.format("Cylinder volume is %.2f", cylinder.getVolume()));
					totalSurfaceArea += cylinder.getSurfaceArea();
					totalVolumn += cylinder.getVolume();
					break;
					
				default:
					shapeChoice = 0;
				}
			} while (shapeChoice == 0);
		}
		System.out.println("============ End ============");
		System.exit(0);
	}

}


// ================================= 2D ===============================================

interface Shape2D {
	public double getArea();
}


class Rectangle implements Shape2D {
	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double getArea() {
		return this.length * this.width;
	}
}


class Square extends Rectangle{
	public Square(int side) {
		super(side ,side);		
	}
	
	public int getSide() {
		return super.getLength();
	}
	
	public void setSide(int side) {
		super.setLength(side);
		super.setWidth(side);
	}
}


class Circle implements Shape2D {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * this.radius * this.radius;
	};
}


class Triangle implements Shape2D{
	private int height;
	private int base;
	
	public Triangle(int height, int base) {
		this.height = height;
		this.base = base;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public double getArea() {
		return 0.5 * this.height * this.base;
	}
}


// ================================= 3D ===============================================

interface Shape3D {
	public double getVolume();
	public double getSurfaceArea();
}


class Cuboid extends Rectangle implements Shape3D {
	private int height;

	public Cuboid(int length, int width, int height) {
		super(length, width);
		this.height = height;
	}

	public double getVolume() {
		return super.getLength() * super.getWidth() * this.height;
	}

	public double getSurfaceArea() {
		return 2 * ( super.getLength() * super.getWidth() + super.getWidth() * this.height + this.height * super.getLength());
	}
}


class Cone extends Circle implements Shape3D {

	private int height;

	public Cone(int radius, int height) {
		super(radius);
		this.height = height;
	}

	public double getVolume() {
		return (1.0 / 3.0) * Math.PI * Math.pow(super.getRadius(), 2) * this.height;
	}

	public double getSurfaceArea() {
		return Math.PI * super.getRadius() * (super.getRadius() + Math.sqrt(Math.pow(this.height, 2) + Math.pow(super.getRadius(), 2)));
	}

}


class Cylinder extends Circle implements Shape3D {

	private int height;
	
	public Cylinder(int radius, int height) {
		super(radius);
		this.height = height;
	}
	
	public double getVolume() {
		return Math.PI * Math.pow(super.getRadius(), 2) * this.height;
	}
	
	public double getSurfaceArea() {
		return (2 * Math.PI * super.getRadius() * this.height) + (2 * Math.PI * Math.pow(super.getRadius(), 2));
	}
}


class Pyramid extends Triangle implements Shape3D {
	public Pyramid(int height, int base) {
		super(height, base);
	}
	
	public double getVolume() {
		return (1.0 / 3.0) * Math.pow(super.getBase(), 2) * super.getHeight();
	}

	public double getSurfaceArea() {
        double resultPyramidArea = (super.getBase() * super.getBase()) + (super.getBase() * Math.sqrt(Math.pow(super.getBase() / 2, 2) +
                Math.pow(super.getHeight(), 2))) + (super.getBase() * Math.sqrt(Math.pow(super.getBase() / 2, 2) + Math.pow(super.getHeight(), 2)));
        return resultPyramidArea;
	}
}


class Sphere extends Circle implements Shape3D {
	public Sphere(int radius) {
		super(radius);
	}

	public double getVolume() {
		return (4.0 / 3.0) * Math.PI * Math.pow(super.getRadius(), 3);
	}
	
	public double getSurfaceArea() {
		return 4 * Math.PI * super.getRadius() * super.getRadius();
	}
}




