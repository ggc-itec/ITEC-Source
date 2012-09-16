package week05;

public class BufferDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SharedBuffer buffer = new SharedBuffer();
		Producer p = new Producer(buffer);
		Consumer c = new Consumer(buffer);
		Thread pthread = new Thread(p);
		Thread cthread = new Thread(c);
		Thread cthread2 = new Thread(new Consumer(buffer));
		pthread.start();
		cthread.start();
		cthread2.start();
	}

}
