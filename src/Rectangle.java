import java.awt.Graphics;

public class Rectangle extends Shape{

	@Override
	public void draw(Graphics g) {
		g.setColor(c);
		g.fillRect(x, y, width, height);		
	}

}
