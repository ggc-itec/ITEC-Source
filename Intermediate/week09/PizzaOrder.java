package week09;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PizzaOrder {

	private JFrame frame;
	private JLabel pictureLabel;
	private JCheckBox pepperoni;
	private JCheckBox mushrooms;
	private JCheckBox olives;
	private JRadioButton thin;
	private JRadioButton stuffed;
	private JRadioButton pan;
	private JComboBox payment;
	private JButton orderButton;
	private JButton cancelButton;
	private double total = 10;

	private void makeComponents() {
		frame = new JFrame("Papa Bob's");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(5, 1));
		pictureLabel = new JLabel(new ImageIcon("images/cutecat.jpg"));
		pepperoni = new JCheckBox("Pepperoni");
		mushrooms = new JCheckBox("Mushrooms");
		olives = new JCheckBox("Olives");
		thin = new JRadioButton("Thin");
		stuffed = new JRadioButton("Stuffed");
		pan = new JRadioButton("Pan");
		payment = new JComboBox(new String[] { "Check", "Credit", "Cash" });
		orderButton = new JButton("Order");
		cancelButton = new JButton("Cancel");
	}

	private JPanel makeButtonPanel() {
		JPanel panel = new JPanel();
		panel.add(orderButton);
		panel.add(cancelButton);
		return panel;

	}

	private JPanel makePaymentPanel() {
		JPanel panel = new JPanel();
		panel.add(payment);
		payment.addActionListener(new PaymentListener());
		return panel;
	}

	private JPanel makeCrustPanel() {
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder("Crust"));
		panel.setLayout(new GridLayout(3, 1));
		panel.add(thin);
		panel.add(stuffed);
		panel.add(pan);
		ButtonGroup bg = new ButtonGroup();
		bg.add(thin);
		bg.add(stuffed);
		bg.add(pan);
		CrustListener crustListener = new CrustListener();
		thin.addActionListener(crustListener);
		stuffed.addActionListener(crustListener);
		pan.addActionListener(crustListener);
		return panel;
	}

	private JPanel makeToppingsPanel() {
		JPanel panel = new JPanel();
		// panel.setLayout(new GridLayout(3,1));
		panel.add(pepperoni);
		panel.add(mushrooms);
		panel.add(olives);
		ToppingsListener toppingsListener = new ToppingsListener();
		pepperoni.addActionListener(toppingsListener);
		mushrooms.addActionListener(toppingsListener);
		olives.addActionListener(toppingsListener);
		return panel;
	}

	private void makeLayout() {
		frame.add(pictureLabel);
		frame.add(makeToppingsPanel());
		frame.add(makeCrustPanel());
		frame.add(makePaymentPanel());
		frame.add(makeButtonPanel());
		frame.pack();
	}

	private void setVisible() {
		frame.setVisible(true);
	}

	public class ToppingsListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (pepperoni.isSelected()) {
				total += 0.5;
			}
			if (mushrooms.isSelected()) {
				total += 0.5;
			}
			if (olives.isSelected()) {
				total += 0.5;
			}
			System.out.println("Price: " + total);
		}

	}

	public class PaymentListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String str = (String) payment.getSelectedItem();
			if (str.equals("Check")) {
				total = total * 0.3 + total;
			} else if (str.equals("Credit")) {
				total = total * 0.2 + total;
			} else {
				total = total - total * 0.2;
			}
			System.out.println("Price: " + total);
		}

	}

	public class CrustListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == thin) {
				total += 1;
			} else if (e.getSource() == pan) {
				total += 1;
			}
			System.out.println("Price: " + total);
		}

	}

	public static void main(String[] args) {
		PizzaOrder pizza = new PizzaOrder();
		pizza.makeComponents();
		pizza.makeLayout();
		pizza.setVisible();
	}

}
