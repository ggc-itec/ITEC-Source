package week01;

import java.awt.BorderLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ListenerExample implements WindowListener {
	
	// how it this different from the AdapterExample class?
	// why would using the WindowAdapter be a better idea?
	// can you tell the difference between an interface and an abstract class?
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("My Window");
		myFrame.addWindowListener(new AdapterExample());
        myFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //why have this?
		myFrame.setLayout(new BorderLayout());
		myFrame.setSize(500,500);
		myFrame.setVisible(true);		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		JFrame frame = (JFrame) e.getSource();
		int num = JOptionPane.showConfirmDialog(frame, "Are you sure?");
		
		if (num == JOptionPane.YES_OPTION)
		{
		   	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
}
