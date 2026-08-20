package lab9;

import java.awt.Color;
import java.awt.Point;

public class Circle extends Shape {
	
	protected double radius;

	public Circle(double radius, Color color, Point position) {
		super(color, position);
		this.radius = radius;
	}
	
	double getArea() {
		double pi = Math.PI;
		return 2 * (pi * Math.pow(radius, 2));
	}
	
	double getCircumference() {
		double pi = Math.PI;
		return 2 * (pi * radius);
	}
	
	double getDiameter() {
		return radius * 2;
	}
	
	double getRadius() {
		return this.radius;
	}
	
	String printCharacteristics() {
		return "| Radius: " + radius +
			   " | Diameter: " + getDiameter() +
			   " | Circumference: " + getCircumference() +
			   " | Area: " + getArea() +
			   " | Color: " + color +
			   " | Position: " + position +
			   " |";
	}

	protected void setRadius(double radius) {
		this.radius = radius;
	}

}
