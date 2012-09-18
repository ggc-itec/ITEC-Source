package week03;

import java.util.Scanner;

public class LetterCounter {

	public static void main(String[] args) { 

		int i= 0;
		String str= "";    
		Scanner keyboard = new Scanner(System.in);

		// need to alert user to type
		System.out.println("Please enter a String");
		String input = keyboard.next();
		System.out.println("Please enter a Character.");
		String letter = keyboard.next();


		int count = 0;    

		while (i < input.length() )
		{
			if( input.substring(i,i+1).equals(letter) )
			{
				count = count + 1;        
			}

			i= i +1;      
		} 

		System.out.println(letter +  " Appears: " + count + " times.");
	} 
}