package week1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class Drawing extends JComponent {

	private static final long serialVersionUID = 1L;
	private Rectangle box = new Rectangle(200,200,20,20); // (x,y,w,h)
	private int x = 100;
	private int y = 200;
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		box.setLocation(x,y);
		g2.draw(box);
	}

	public void moveX() {
		x = x + 10;
		repaint();
	}
	
	public void moveY() {
		y = y + 10;
		repaint();
	}
	
}
