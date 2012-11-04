package week11;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() {
		super("MyFrame");
	}
	
	public static void main(String[] args) {
	    MyFrame frame = new MyFrame();
	    frame.setSize(500,500);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
	
}
