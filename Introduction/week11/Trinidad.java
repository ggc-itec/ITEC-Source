package week11;

import java.io.PrintWriter;

public class Trinidad {

	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("trinidad.ppm");
		int width = 600;
		int height = 400;
		pw.println("P3");
		pw.println("# yay! I am creating my own image");
		pw.println(width + " " + height);
		pw.println("255");

		int X = 0;

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width - X; j++) {
				pw.println("0");
				pw.println("0");
				pw.println("255");
			}
			X = X + (int) Math.sqrt(2);
			for (int j = 0; j < X; j++) {
				pw.println("255");
				pw.println("0");
				pw.println("0");
			}
		}

		pw.close();
	}

	/* ADD YOUR CODE HERE */

}
