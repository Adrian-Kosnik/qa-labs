package lab9;

import java.awt.Color;
import java.awt.Point;

public class Program {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(50, 50, Color.red, new Point(10, 10));
		Circle circle = new Circle(20, Color.blue, new Point(20, 20));
		Sphere sphere = new Sphere(50, Color.orange, new Point(50, 50));
		
		System.out.println("\n--------------------------------------\n");
		
		System.out.println(rectangle.getCharacteristics());
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getCircumference());
		
		System.out.println("\n--------------------------------------\n");
		
		System.out.println(circle.getArea());
		System.out.println(circle.getCircumference());
		System.out.println(circle.getDiameter());
		System.out.println(circle.getRadius());
		System.out.println(circle.printCharacteristics());
		
		System.out.println("\n--------------------------------------\n");
		
		System.out.println(sphere.getArea());
		System.out.println(sphere.getCircumference());
		System.out.println(sphere.getDiameter());
		System.out.println(sphere.getRadius());
		System.out.println(sphere.getVolume());
		System.out.println(sphere.printCharacteristics());
		
		System.out.println("\n--------------------------------------\n");
	}

}
