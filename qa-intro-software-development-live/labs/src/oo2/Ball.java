package oo2;

public class Ball {

	public int x;
	public int y;
	public int w;
	public int h;
	private int dirX;
	private int dirY;

	
	public Ball(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	public Ball(int x, int y, int w, int h, int dirX, int dirY) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY = dirY;
	}

	public void move() {
		x += dirX;
		y += dirY;
		
		if(x < 0) {
			this.x = 0;
			dirX = -dirX;
		}
		
		if(y < 0) {
			this.y = 0;
			dirY = -dirY;
		}
		
		if (x > 300 - this.w) {
			dirX = -dirX;
		}
		
		if (y > 300 - this.h) {
			dirY = -dirY;
		}
		
	}

	

}
