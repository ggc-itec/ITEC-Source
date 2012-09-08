package week3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileReadExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("docs/mytext.txt");
		Scanner scanner = new Scanner(file);

		while (scanner.hasNextLine())
		{
			String line = scanner.nextLine();
			System.out.println(line);
		}
	}

}
