package week08;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChanger extends JPanel {

	private JButton red;
	private JButton green;

	public ColorChanger() {
		red = new JButton("red");
		green = new JButton("green");
		add(red);
		add(green);
		red.addActionListener(new MyButtonListener());
		green.addActionListener(new MyButtonListener());
	}

	public class MyButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == red) {
				setBackground(Color.RED);
			} else {
				setBackground(Color.GREEN);
			}
		}
	}

	public static void main(String[] args) {
		JPanel myPanel = new ColorChanger();
		JFrame frame = new JFrame("Color Change");
		frame.add(myPanel);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
