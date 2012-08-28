package week1;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class DrawingViewer {

	private Drawing d = new Drawing();

	
	class MyKeyListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO complete DOWN and LEFT
			if(e.getKeyCode() == KeyEvent.VK_UP)
				d.moveY();
			if(e.getKeyCode() == KeyEvent.VK_RIGHT)
				d.moveX();
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public DrawingViewer() {
		JFrame myFrame = new JFrame("Drawing");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		myFrame.setLayout(new BorderLayout());
		myFrame.add(d,BorderLayout.CENTER);
		myFrame.addKeyListener(new MyKeyListener());
		myFrame.setSize(500,500);
		myFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
	   new DrawingViewer();
	}
}
