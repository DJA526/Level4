import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected Color c;

	public abstract void draw(Graphics g);
	
	public void setColor(Graphics g, int red, int green, int blue) {
		c = new Color(red, green, blue);
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
}
