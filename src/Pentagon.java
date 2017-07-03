import java.awt.Graphics;

public class Pentagon extends Shape{

	@Override
	public void draw(Graphics g) {
		g.setColor(c);
		g.drawPolygon();
	}

}
