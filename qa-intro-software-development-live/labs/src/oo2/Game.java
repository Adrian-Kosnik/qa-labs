package oo2;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;


public class Game extends Canvas {
	public static void main(String[] args) {
		new Game();
	}

	private Ball[] balls;

	// create an array of 3 balls
	// call this array balls

	Game() {
		
		balls = new Ball[3];
		balls[0] = new Ball(50, 10, 20, 20, 1, 1);
		balls[1] = new Ball(200, 10, 50, 50, 3, 3);
		balls[2] = new Ball(20, 250, 30, 30, 2, 2);
		
		JFrame frame = new JFrame();
		this.setSize(400, 400);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);

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
	// call the move() method of each balls
	// Tip: use an enhanced for loop to pick 
	//	  each ball in the balls array.
		this.repaint();
	}

	public void paint(Graphics g) {
		g.drawRect(0, 0, 300, 300);
		// draw each ball in balls array
		// Tip: See these examples of using the Graphics object
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 300, 300);
		g.setColor(Color.blue);
//		g.fillOval(x, y, width, height);
		
		for(Ball b: balls) {
			g.drawOval(b.x, b.y, b.w, b.h);
			g.fillOval(b.x, b.y, b.w, b.h);
			g.setColor(Color.blue);
			b.move();
		}

	}
}
