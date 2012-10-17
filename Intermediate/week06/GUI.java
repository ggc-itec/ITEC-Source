package week06;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {

	// conceptual (closed humans)
	// programming (in-class)
	// interfaces, inheritance, exceptions

	public static void main(String[] args) {

		JFrame frame = new JFrame("My Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		// frame.setBackground(Color.BLACK);
		frame.setVisible(true);

		JPanel panel = new JPanel();
		JLabel label = new JLabel("My Label");
		JButton button = new JButton("Press me");
		JLabel label2 = new JLabel("Another Label");
		JButton button2 = new JButton("Press me 2");
		button.addActionListener(new ButtonListener());
		button2.addMouseListener(new Button2Listener());
		panel.add(label);
		panel.add(button);
		panel.add(label2);
		panel.add(button2);
		frame.add(panel);

	}

}
