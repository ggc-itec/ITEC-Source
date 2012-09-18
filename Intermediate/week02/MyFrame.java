package week02;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MyFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame(); 
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 1. retrieve name of user
		// 2. output it to label "Hi! ... name"
		String name = JOptionPane.showInputDialog(frame,"What is your name?");
		// the parent window 
		
		JLabel label = new JLabel();
		label.setText("Hi " + name + "!");
		frame.add(label);
		frame.setVisible(true);
	}

}
