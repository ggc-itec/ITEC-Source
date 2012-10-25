package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GrayScale {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("images/success_kid.ppm"));
		PrintWriter pw = new PrintWriter("images/graykid.ppm");
		
		String magic = scanner.nextLine();
		pw.println(magic);
		String comment = scanner.nextLine();
		pw.println(comment);
		String size = scanner.nextLine();
		pw.println(size);
		String rgb = scanner.nextLine();
		pw.println(rgb);
		
		ArrayList<Pixel> pixels = new ArrayList<Pixel>();
		
		while(scanner.hasNextLine())
		{
			String red = scanner.nextLine();
			String green = scanner.nextLine();
			String blue = scanner.nextLine();
			Pixel pixel = new Pixel(red,green,blue);
			pixel.turnGray();
			pixels.add(pixel);
		}
		
		Iterator<Pixel> it = pixels.iterator();
		
		while( it.hasNext() )
		{
			Pixel pixel = it.next();
			pw.println(pixel.toString());
		}
		
		
		scanner.close();
		pw.close();
	}
}
