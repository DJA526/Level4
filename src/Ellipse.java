import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class Ellipse extends Shape {

	@Override
	public void draw(Graphics g) {
		g.setColor(c);
		g.drawOval(x, y, width, height);
	}

}
