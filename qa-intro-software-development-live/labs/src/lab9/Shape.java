package lab9;

import java.awt.Color;
import java.awt.Point;

public class Shape {
	
	protected Color color; 
	protected Point position;

	public Shape(Color color, Point position) {
		this.color = color;
		this.position = position;
	}

	protected Color getColor() {
		return color;
	}

	protected void setColor(Color color) {
		this.color = color;
	}

	protected Point getPosition() {
		return position;
	}

	protected void setPosition(Point position) {
		this.position = position;
	}

}
