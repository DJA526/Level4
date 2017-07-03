import java.awt.Graphics;

public class Ellipse extends Shape {

	@Override
	public void draw(Graphics g) {
		g.setColor(c);
		g.fillOval(x, y, width, height);
	}

}
