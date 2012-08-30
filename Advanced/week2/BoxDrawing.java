package week2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JComponent;

public class BoxDrawing extends JComponent {

	// draws a bunch of concentric rectangles
	
	private static final long serialVersionUID = 1L;
	private ArrayList<Rectangle> boxes = new ArrayList<Rectangle>();
	
	public BoxDrawing() {
		Rectangle box = new Rectangle(250,250,20,20); // (x,y,w,h)
		boxes.add(box);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		for(int i=0; i<boxes.size(); i++)
		{
			Rectangle box = boxes.get(i);
			if( i%2 == 0)
				g2.setColor(Color.RED);
			else
				g2.setColor(Color.BLUE);
			g2.draw(box);
		}
	}
	
	public void addBox() {
		Rectangle oldBox = boxes.get(boxes.size()-1);
		int x = (int) oldBox.getX() - 20;
		int y = (int) oldBox.getY() - 20;
		Rectangle box = new Rectangle(x,y,(int) oldBox.getWidth()+20+20,(int) oldBox.getHeight()+20+20);
		boxes.add(box);
		repaint();	
	}
}
