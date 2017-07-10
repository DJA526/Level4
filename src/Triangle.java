import java.awt.Graphics;

public class Triangle extends Shape{

	@Override
	public void draw(Graphics g) {
		g.setColor(c);
		int[] xs = {x, (x + (width/2)), (x + width)};
		int[] ys = {y, (y + height), y};
		g.fillPolygon(xs, ys, 3);
	}
	
}
