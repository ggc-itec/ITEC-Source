package week01;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// illustrates inheritance
public class SimplePanel extends JPanel {


	// TODO: Go to Window -> Show View -> Tasks (TODO is a tag)
	public SimplePanel() 
	{
		super(new FlowLayout());
		JLabel label;
		try {
			URL url = new URL("http://i.imgur.com/gm8yMh.jpg");
			BufferedImage file = ImageIO.read(url);
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel(icon);
			add(label);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {  // why use the EventQueue?
			public void run() {
				try {
					JFrame frame = new JFrame();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setLayout(new BorderLayout());
					frame.add(new SimplePanel(),BorderLayout.CENTER);
					frame.pack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
