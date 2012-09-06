package week3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class GridBagExample {

	private JFrame frame;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JButton button;
	private JButton button2;

	public static void main(String[] args) {
		GridBagExample window = new GridBagExample();
		window.initialize();
		
	}

	public void initialize() {

		frame = new JFrame();
		firstNameField = new JTextField(10);
		lastNameField = new JTextField(10);
		firstNameLabel = new JLabel("First Name");
		lastNameLabel = new JLabel("Last Name");

		JPanel panel = new JPanel();

		panel.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.insets = new Insets(5,5,5,5);

		gc.anchor = GridBagConstraints.LINE_START;
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

		gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 1;
		gc.gridy = 2;
		button = new JButton("Click");
		button2 = new JButton("Exit");
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));
		buttonPanel.add(button);
		buttonPanel.add(button2);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Hello " + firstNameField.getText() + " " + lastNameField.getText());
			}
		});
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		//button.setPreferredSize(new Dimension(100,200));
		frame.add(buttonPanel, BorderLayout.SOUTH);

		//frame.setLayout(new FlowLayout());
		frame.add(panel,BorderLayout.NORTH);
		//frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
		frame.setLocationRelativeTo(null);
	}

}
