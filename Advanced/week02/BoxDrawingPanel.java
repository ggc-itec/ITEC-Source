package week02;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;


public class BoxDrawingPanel {
	private int width = 500;
	private int height = 500;
	private String name;
	private BoxDrawing drawing = new BoxDrawing();
	
	class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			drawing.addBox();
		}
	}
	
	public BoxDrawingPanel() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addMouseListener(null);		
		frame.setLayout(new BorderLayout());
		frame.add(drawing,BorderLayout.CENTER);
		frame.setSize(width,height);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new BoxDrawingPanel();
	}
	
	
}
