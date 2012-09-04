package week3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridBagExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
JFrame frame = new JFrame();
		
		JTextField firstNameField = new JTextField(10);
		JTextField lastNameField = new JTextField(10);
		JLabel firstNameLabel = new JLabel("First Name  ");
		JLabel lastNameLabel = new JLabel("Last Name  ");
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.insets = new Insets(3,3,3,3);
		
		gc.anchor = GridBagConstraints.LINE_END	;
		gc.weighty = 100;
		gc.gridx = 0;
		gc.gridy = 0;
		panel.add(firstNameLabel,gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		panel.add(lastNameLabel,gc);

		gc.gridx = 1;
		gc.gridy = 0;
		panel.add(firstNameField,gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		panel.add(lastNameField,gc);
		
		gc.gridx = 1;
		gc.gridy = 2;
		JButton button = new JButton("Click");
		//button.setPreferredSize(new Dimension(100,200));
		panel.add(button,gc);
		
		//frame.setLayout(new FlowLayout());
		frame.add(panel,BorderLayout.NORTH);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}

}
