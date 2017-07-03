import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ShapesRunner implements MouseListener, MouseMotionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel(){
		public void paintComponent(Graphics g) {
			for (Shape s : shapes) {
				int red = Integer.parseInt(redVal.getText());
				int green = Integer.parseInt(greenVal.getText());
				int blue = Integer.parseInt(blueVal.getText());
				s.setColor(g, red, green, blue);
				s.draw(g);
			}
		}
	};
	JRadioButton ellipse = new JRadioButton();
	JRadioButton rectangle = new JRadioButton();
	ButtonGroup bg = new ButtonGroup();
	JLabel red = new JLabel();
	JLabel green = new JLabel();
	JLabel blue = new JLabel();
	JTextField redVal = new JTextField(3);
	JTextField greenVal = new JTextField(3);
	JTextField blueVal = new JTextField(3);
	ArrayList<Shape> shapes = new ArrayList<Shape>();
	
	public static void main(String[] args) {
		ShapesRunner a = new ShapesRunner();
	}
	
	ShapesRunner() {
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.addMouseMotionListener(this);
		frame.addMouseListener(this);
		panel.add(ellipse);
		panel.add(rectangle);
		panel.add(red);
		panel.add(redVal);
		panel.add(green);
		panel.add(greenVal);
		panel.add(blue);
		panel.add(blueVal);
		ellipse.setText("ellipse");
		rectangle.setText("rectangle");
		bg.add(ellipse);
		bg.add(rectangle);
		red.setText("red:");
		green.setText("green:");
		blue.setText("blue:");
		redVal.setText("0");
		greenVal.setText("0");
		blueVal.setText("0");
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		Shape s = shapes.get(shapes.size() - 1);
		s.setWidth(e.getX() - s.getX());
		s.setHeight(e.getY() - s.getY());
		panel.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (ellipse.isSelected() == true) {
			Shape ellipse = new Ellipse();
			ellipse.setX(e.getX());
			ellipse.setY(e.getY());
			shapes.add(ellipse);
		} else {
			Shape rect = new Rectangle();
			rect.setX(e.getX());
			rect.setY(e.getY());
			shapes.add(rect);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
