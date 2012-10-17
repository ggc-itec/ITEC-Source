package week07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FloatReader {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		double sum = 0;
		int tries = 0;
		boolean done = false;
		while (!done) {
			double input = 0;
			try {
				System.out.println("Please enter a number");
				input = keyboard.nextDouble();
				sum = sum + input;
			} catch (InputMismatchException e) {
				keyboard.nextLine();
				tries += 1;
				if (tries == 2) {
					done = true;
				}
			}

		}
		System.out.println("The sum is: " + sum);
	}

	/*
	 * @param nums is expected to have at least one element
	 * 
	 * @throws IllegalArgumentException for size == 0
	 * 
	 * @return the max value of the array
	 */
	public int max(int[] nums) {
		if (nums.length == 0)
			throw new IllegalArgumentException();

		for (int i = 0; i < nums.length; i++) {
			// TODO: find max
		}
		return 0;
	}

}
