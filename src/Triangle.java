import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class Triangle extends Shape{

	@Override
	public void draw(Graphics g) {
		g.setColor(c);
		g.drawPolygon(p);
	}
	
}
