package week06;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;

public class Button2Listener extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Button 2 pressed");
	}

}
