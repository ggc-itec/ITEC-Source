package week3;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Animation extends JComponent implements Runnable {

	private int a=100,b=100,x=200,y=200;

	@Override
	protected void paintComponent(Graphics g) {
		g.drawLine(a,b,x,y);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Animation ani = new Animation();
		Thread t = new Thread(ani);
		t.setDaemon(true);
		t.start();
		frame.add(ani);
		frame.setVisible(true);
	}

	@Override
	public void run() {
		while(true)
		{
			a++; b++;x++;y++;
			repaint();
			System.out.println("repainting");
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("slept");
		}
	}
}
