package lab9;

import java.awt.Color;
import java.awt.Point;

public class Sphere extends Circle {

	public Sphere(double radius, Color color, Point position) {
		super(radius, color, position);
	}
	
	double getVolume() {
		double pi = Math.PI;
		return 2 * (pi * Math.pow(radius, 3));
	}
	
	String printCharacteristics() {
		return "| Radius: " + radius +
			   " | Diameter: " + getDiameter() +
			   " | Circumference: " + getCircumference() +
			   " | Area: " + getArea() +
			   " | Volume: " + getVolume() +
			   " | Color: " + color +
			   " | Position: " + position +
			   " |";
	}

}
