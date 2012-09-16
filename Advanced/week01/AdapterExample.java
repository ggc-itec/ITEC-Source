package week01;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AdapterExample extends WindowAdapter {
	
	@Override
	public void windowClosing(WindowEvent e) {
		JFrame frame = (JFrame) e.getSource();
		int num = JOptionPane.showConfirmDialog(frame, "Are you sure?");
		
		if (num == JOptionPane.YES_OPTION)
		{
		   	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

	public static void main(String[] args) {
		JFrame myFrame = new JFrame("My Window");
		myFrame.addWindowListener(new AdapterExample());
        myFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //why have this?
		myFrame.setLayout(new BorderLayout());
		myFrame.setSize(500,500);
		myFrame.setVisible(true);		
	}
}
