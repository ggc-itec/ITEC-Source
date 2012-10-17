package week08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class InterestCalculator {

	private JFrame frame;
	private JButton button;
	private JTextField textfield;
	private JLabel label;
	private JPanel panel;
	//private Enum Gender { MALE, FEMALE };
	
	public InterestCalculator() {
		frame = new JFrame("Interest Calculator");
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		button = new JButton("Calculate");
		frame.add(button, BorderLayout.NORTH);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				calculateInterest();
			}
		});

		textfield = new JTextField();
		textfield.setText("Please enter a number");
		frame.add(textfield, BorderLayout.SOUTH);
		
		ImageIcon icon = new ImageIcon("images/cutecat.jpg");
		label = new JLabel(icon);
		label.setText("Entered Text");
		//frame.add(label,BorderLayout.CENTER);
		panel = new JPanel();
		JRadioButton savings = new JRadioButton("Savings");
		JRadioButton checkings = new JRadioButton("Checkings");
		panel.add(savings);
		panel.add(checkings);
		panel.setBackground(Color.GREEN);
		ButtonGroup bg = new ButtonGroup();
		bg.add(savings);
		bg.add(checkings);
		frame.add(panel,BorderLayout.CENTER);
		frame.setVisible(true);
		
	}

	public void calculateInterest() {
		String str = textfield.getText();
		double amount = Double.parseDouble(str);
		JOptionPane.showMessageDialog(null,"You entered " + amount);
		double total = amount*0.06 + amount;
		//label.setText("The user earned a total of " + total);
	}
	
	public static void main(String[] args) {
		new InterestCalculator();
	}
}
