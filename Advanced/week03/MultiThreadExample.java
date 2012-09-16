package week3;

import java.util.Scanner;

import javax.swing.JFrame;

public class MultiThreadExample {

	// what is a static class?
	static class MyConsoleReader implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Enter console command");
			Scanner keyboard = new Scanner(System.in);
			String input="";
			do {
				input = keyboard.next();
				System.out.println(input);
			} while( !input.equals("end"));
		}
		
	}
	
	public static void main(String[] args) {
		Thread t = new Thread(new MyConsoleReader());
		t.start();
		JFrame frame = new JFrame("My Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
}
