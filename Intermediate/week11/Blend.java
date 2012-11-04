package week11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Blend {
  
	/**
	 * Alpha Blending takes an alpha from (0..1)
	 * for each rgb value
	 * if alpha = 0.2
	 *    remaining = 1 - alpha
	 *    
	 *    r1*alpha + r2*remaining
	 *    g1*alpha + g2*remaining
	 *    b1*alpha + b2*remaining
	 *    
	 */
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner1 = new Scanner(new File("images/guy.ppm"));
		Scanner scanner2 = new Scanner(new File("images/hamburger.ppm"));
		PrintWriter pw = new PrintWriter("images/blend.ppm");
	
		processHeader(scanner1,scanner2,pw);
		
		double alpha = 0.5;
		double remaining = 1 - alpha;
		while(scanner1.hasNextLine() && scanner2.hasNextLine())
		{
			Pixel pixel1 = new Pixel(scanner1.nextLine(), 
					scanner1.nextLine(), scanner1.nextLine());
			Pixel pixel2 = new Pixel(scanner2.nextLine(),
					scanner2.nextLine(), scanner2.nextLine());
			pixel1.turnAlpha(alpha, pixel2);
			pw.println(pixel1);
		}
	}

	private static void processHeader
	(Scanner scanner1, Scanner scanner2, PrintWriter pw) {
		String magic = scanner1.nextLine();
		String comment = scanner1.nextLine();
		String size = scanner1.nextLine();
		String max = scanner1.nextLine();
		pw.println(magic);
		pw.println(comment);
		pw.println(size);
		pw.println(max);
		scanner2.nextLine();
		scanner2.nextLine();
		scanner2.nextLine();
		scanner2.nextLine();
	}


}
