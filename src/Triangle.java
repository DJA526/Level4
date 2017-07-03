import java.awt.Graphics;

public class Triangle extends Shape{

	@Override
	public void draw(Graphics g) {
		g.setColor(c);
		g.drawPolygon(p);
	}
	
}
