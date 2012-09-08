package week3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriteExample {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {

		// creates "mytext.txt" in the "docs" folder
		File file = new File("docs/mytext.txt");
		PrintWriter pw = new PrintWriter(file); 
		pw.println("hello world");
		pw.close();		
	}

}
