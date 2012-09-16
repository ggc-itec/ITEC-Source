package week05;

public class Consumer implements Runnable {

	private SharedBuffer buffer;

	public Consumer(SharedBuffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		while (true) {
			String str = buffer.removeString();
			System.out.println("String removed: " + str);
		}

	}

}
