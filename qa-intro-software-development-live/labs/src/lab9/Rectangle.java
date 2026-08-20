package lab9;

import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Shape {
	
	protected int sideA;
	protected int sideB;

	public Rectangle(int sideA, int sideB, Color color, Point position) {
		super(color, position);
		this.sideA = sideA;
		this.sideB = sideB;
	}
	
	int getArea() {
		return sideA * sideB;
	}
	
	String getCharacteristics() {
		return "| Side A: " + sideA +
			   " | Side A: " + sideB +
			   " | Circumference: " + getCircumference() +
			   " | Area: " + getArea() +
			   " | Color: " + color +
			   " | Position: " + position +
			   " |";
	}
	
	int getCircumference() {
		return (sideA * 2) + (sideB * 2);
	}

}
