package week07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineCounter {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("play.txt");
		Scanner scanner = new Scanner(file);
		int count = 0;
		while( scanner.hasNext() )
		{
			//System.out.println(scanner.nextLine());
			String token = scanner.next();
			if( token.equalsIgnoreCase("the"))
			{
				count += 1;
			}
			
		}
		System.out.println(count);
	}
}
