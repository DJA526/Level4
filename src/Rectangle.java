import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class Rectangle extends Shape{

	@Override
	public void draw(Graphics g) {
		g.setColor(c);
		g.drawRect(x, y, width, height);		
	}

}
