package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("images/success_kid.ppm"));
		PrintWriter pw = new PrintWriter("images/kid.ppm");

		String magic = scanner.nextLine();
		pw.println(magic);
		String comment = scanner.nextLine();
		pw.println(comment);
		String size = scanner.nextLine();
		pw.println(size);
		String rgb = scanner.nextLine();
		pw.println(rgb);

		// read each pixel, store into array
		String[] lengths = size.split(" ");
		int width = Integer.parseInt(lengths[0]);
		int height = Integer.parseInt(lengths[1]);
		String[][] values = new String[width][height];

		// homework 6
		int index = 0;
		// write to printwriter obj
		while (scanner.hasNextLine()) {
			String red = scanner.nextLine();
			String green = scanner.nextLine();
			String blue = scanner.nextLine();
			int r = Integer.parseInt(red);
			int g = Integer.parseInt(green);
			int b = Integer.parseInt(blue);
			// Y = 0.2126 R + 0.7152 G + 0.0722 B
			int gray = (int) (0.21 * r + 0.71 * g + 0.07 * b);
			pw.println(gray);
			pw.println(gray);
			pw.println(gray);
		}

		// done!

		scanner.close();
		pw.close();
	}
}
