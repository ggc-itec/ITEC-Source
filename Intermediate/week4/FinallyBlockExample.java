package week4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FinallyBlockExample {

	public static void main(String[] args) throws IOException {
		try {

			while (true) {
				System.out.println("Enter you filename (with the folder)");
				Scanner keyboard = new Scanner(System.in);

				File file = new File(keyboard.next());
				Scanner scanner = new Scanner(file);
				System.out.println("found file!");
			}

		} catch (Exception e) {
			System.out.println("caught exception");
		} finally {
			System.out
					.println("bye bye, not file found, that must mean you want to stop");
		}

	}

}
