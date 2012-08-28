package week1;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class DrawingViewer {

	public static void main(String[] args) {
		final Drawing d = new Drawing();
		JFrame myFrame = new JFrame("Drawing");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		myFrame.setLayout(new BorderLayout());
		myFrame.add(d,BorderLayout.CENTER);
		myFrame.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO complete DOWN and LEFT
				if(e.getKeyCode() == KeyEvent.VK_UP)
					d.moveY();
				if(e.getKeyCode() == KeyEvent.VK_RIGHT)
					d.moveX();
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyTyped(KeyEvent e) {				
			}
		
		});
		myFrame.setSize(500,500);
		myFrame.setVisible(true);		
	}
}
