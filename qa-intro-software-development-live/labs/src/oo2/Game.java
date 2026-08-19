package oo2;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends Canvas {
	public static void main(String[] args) {
		new Game();

//		String name = "Adrian";
//		char nameCharTwo = name.charAt(2);
//		char nameUpper = Character.toUpperCase(nameCharTwo);
//		char nameLower = Character.toLowerCase(nameUpper);
//
//		System.out.println(name);
//		System.out.println(nameCharTwo);
//		System.out.println(nameUpper);
//		System.out.println(nameLower);
	}

	private ArrayList<Shape> shapes;

	// create an array of 3 shapes
	// call this array shapes

	Game() {
		
		shapes = new ArrayList<Shape>();
		shapes.add(new Shape(50, 10, 20, 20, 1, 1, ShapeType.Rectangle));
		shapes.add(new Shape(200, 10, 50, 50, 3, 3, ShapeType.ThreeDRectangle));
		shapes.add(new Shape(20, 250, 30, 30, 2, 2, ShapeType.RoundRectangle));
		shapes.add(new Shape(120, 20, 30, 30, 2, 2, ShapeType.Oval));
		shapes.add(new Shape(200, 50, 30, 30, 2, 2, ShapeType.Arc));
		
		JFrame frame = new JFrame();
		this.setSize(400, 400);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);

		Shape.setWorld(100, 100);
		
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				draw();
			}
		};

		t.schedule(tt, 0, 50);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				t.cancel();
				tt.cancel();
			}
		});
	}

	public void draw() {
		// call the move() method of each shapes
		// Tip: use an enhanced for loop to pick
		// each ball in the shapes array.
		this.repaint();
	}

	public void paint(Graphics g) {
		g.drawRect(0, 0, 300, 300);
		// draw each ball in shapes array
		// Tip: See these examples of using the Graphics object
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 300, 300);
		g.setColor(Color.blue);
//		g.fillOval(x, y, width, height);

		for (Shape shape : shapes) {
//			g.drawOval(shape.x, shape.y, shape.w, shape.h);
//			g.fillOval(shape.x, shape.y, shape.w, shape.h);
//			g.setColor(Color.blue);

			if (shape.getShapeType() == ShapeType.Rectangle) {
				g.drawRect(shape.x, shape.y, shape.w, shape.h);
				g.fillRect(shape.x, shape.y, shape.w, shape.h);
				g.setColor(Color.blue);
			} else if (shape.getShapeType() == ShapeType.ThreeDRectangle) {
				g.draw3DRect(shape.x, shape.y, shape.w, shape.h, getFocusTraversalKeysEnabled());
				g.fillRect(shape.x, shape.y, shape.w, shape.h);
				g.setColor(Color.green);
			} else if (shape.getShapeType() == ShapeType.RoundRectangle) {
				g.drawRoundRect(shape.x, shape.y, shape.w, shape.h, shape.w, shape.h);
				g.fillRoundRect(shape.x, shape.y, shape.w, shape.h, shape.w, shape.h);
				g.setColor(Color.red);
			} else if (shape.getShapeType() == ShapeType.Oval) {
				g.drawOval(shape.x, shape.y, shape.w, shape.h);
				g.fillOval(shape.x, shape.y, shape.w, shape.h);
				g.setColor(Color.orange);
			} else if (shape.getShapeType() == ShapeType.Arc) {
				g.drawArc(shape.x, shape.y, shape.w, shape.h, shape.x, shape.y);
				g.fillArc(shape.x, shape.y, shape.w, shape.h, shape.x, shape.y);
				g.setColor(Color.yellow);
			}

			shape.move();
		}

	}
}
