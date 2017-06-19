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
	

}
