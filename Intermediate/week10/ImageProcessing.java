package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ImageProcessing {

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
		String [] lengths = size.split(" ");
		int width = Integer.parseInt(lengths[0]);
		int height = Integer.parseInt(lengths[1]);
		String [] values = new String[width*height*3];
		
		int index = 0;
		// write to printwriter obj
		while( scanner.hasNextLine() )
		{
			values[index] = scanner.nextLine();
			index += 1;
		}
		
		for( int i=values.length-1; i>=0; i-=3)
		{
			pw.println(values[i-2]);
			pw.println(values[i-1]);
			pw.println(values[i]);
		}
		
		// done!
		
		
		scanner.close();
		pw.close();
	}
}
