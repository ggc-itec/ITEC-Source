package week02;

import java.io.File;
import java.util.Scanner;

public class MyConsoleApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		String str = "All work and no play makes Jack a dull boy";
		//String[] strs = str.split(" ");
		//System.out.println(strs[0]);
		//System.out.println(strs[strs.length-1]);

		System.out.println(str.substring(0,3)); 
		System.out.println(str.substring(3));
		System.out.println( Integer.MAX_VALUE );
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);

		/*
		Scanner scanner = new Scanner(str);
		while( scanner.hasNext() )
		{
			String word = scanner.next();
			
			System.out.println( word.substring(1) + "ay" );
		}
		*/
		/*
		int i=0;
		do
		{
			System.out.println(str);
			i++;
		} while(i<1);
		*/
		// TODO Auto-generated method stub
		//System.out.println("Please type your name");
		
		File file = new File("textfiles/play.txt");
		Scanner scanner = new Scanner(file);
		int i=0;
		while( scanner.hasNextLine() )
		{
			i++;
			if(i%2==0)
				continue;
			
			System.out.println( i + " " + scanner.nextLine() );
		}
		 
	}

}
