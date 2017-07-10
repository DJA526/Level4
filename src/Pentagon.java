import java.awt.Graphics;

public class Pentagon extends Shape{

	@Override
	public void draw(Graphics g) {
		g.setColor(c);
		int[] xs = {x, (x + ((width - (height*(int)(Math.tan(36))))/2)), (x + ((width + (height*(int)(Math.tan(36))))/2)), (x + width), (x + (width/2))};
		int[] ys = {y, (y - (height/2)), (y - (height/2)), y, (y + (height/2))};
		g.fillPolygon(xs, ys, 5);
	}

}
