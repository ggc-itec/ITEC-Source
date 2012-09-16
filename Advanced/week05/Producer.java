package week05;

public class Producer implements Runnable {

	private SharedBuffer buffer;

	public Producer(SharedBuffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		while (true) {
			buffer.addString();
			System.out.println("One added");
		}

	}

}
