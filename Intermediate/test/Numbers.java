package test;

/**
 * Program: Numbers
 * 
 * @author: ITEC 2150
 * @version 1.0 Course: ITEC 2150 Written: Sept 24, 2012 Exception Handling
 */
public class Numbers {
	public int add(String a, String b) {
		// If either one is not an integer, use the value 0 when computing the
		// sum.
		int x;
		// implement the correct error processing
		x = Integer.parseInt(a);
		// implement the correct error processing
		int y;
		y = Integer.parseInt(b);
		return x + y;
	}
}
