package week10;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutExample {

	private JFrame frame;
	private JPanel panelOne;
	private JPanel panelTwo;
	private JButton buttonOne;
	private JButton buttonTwo;
	private CardLayout cardLayout;
	
	public CardLayoutExample() {
		makeComponents();
		makeLayout();
	}

	private void makeLayout() {
		frame.setLayout(cardLayout);
		frame.add(panelOne,"one");
		frame.add(panelTwo,"two");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
		
	}

	private void makeComponents() {
		frame = new JFrame("Example");
		frame.setSize(300,300);
		panelOne = new JPanel();
		panelTwo = new JPanel();
		panelOne.add(new JLabel("hello"));
		panelOne.add(new JLabel("hello"));
		buttonOne = new JButton("Press Me 1");
		buttonOne.addActionListener(new CardListener());
		buttonTwo = new JButton("Press Me 2");
		buttonTwo.addActionListener(new OtherCardListener());
		panelOne.add(buttonOne);
		panelTwo.add(buttonTwo);
		cardLayout = new CardLayout();
	}
	
	public class CardListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			cardLayout.show(frame.getContentPane(),"two");
		}
		
	}
	
	public class OtherCardListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			cardLayout.show(frame.getContentPane(),"one");
		}
		
	}
	
	public class BothListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if( e.getSource() == buttonOne)
			{
				cardLayout.show(frame.getContentPane(), "two");
			}
			else
			{
				cardLayout.show(frame.getContentPane(), "one");
			}
		}	
	}
	
	
	// create a listener that shows the first panel
	// register with second button
	
	public static void main(String[] args) {
		CardLayoutExample ce = new CardLayoutExample();
		
	}
}
