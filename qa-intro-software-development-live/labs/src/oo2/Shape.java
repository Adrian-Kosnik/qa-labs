package oo2;

enum ShapeType {
	Rectangle,
	ThreeDRectangle,
	RoundRectangle,
	Oval,
	Arc
};

public class Shape {

	public int x;
	public int y;
	public int w;
	public int h;
	
	private int dirX;
	private int dirY;
	private ShapeType shapeType;

	static int worldW;
	static int worldH;
	
	public ShapeType getShapeType() {
		return shapeType;
	}
	
	public Shape(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	public Shape(int x, int y, int w, int h, int dirX, int dirY, ShapeType shapeType) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY = dirY;
		this.shapeType = shapeType;
	}
	
	public static void setWorld(int w, int h) {
		worldW = w;
		worldH = h;
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
