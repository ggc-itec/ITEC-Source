package week05;

import java.util.ArrayList;

public class SharedBuffer {

	private ArrayList<String> strs;
	private final int BUFFER_SIZE = 10;

	public SharedBuffer() {
		strs = new ArrayList<String>();
	}

	public synchronized String removeString() {
		// the api tells us that the wait() call should always be used in a
		// loop, why?
		while (strs.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		String str = strs.get(0);
		strs.remove(0);
		notifyAll();
		return str;
	}

	public synchronized void addString() {
		while (strs.size() == BUFFER_SIZE) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		strs.add("XXXXX");
		notifyAll();
	}
}
