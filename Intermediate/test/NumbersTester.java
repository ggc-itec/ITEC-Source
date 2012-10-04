package test;

/**
 * Program: NumbersTester *
 * 
 * @author: ITEC 2150 *
 * @version 1.0 * Course: ITEC 2150 * Written: Sept 24, 2012 * * Exception
 *          Handling Test Question
 **/
public class NumbersTester {
	public static void main(String[] args) {
		String a = "2";
		String b = "3";
		Numbers number1 = new Numbers();
		System.out.println("Expected:  5");
		System.out.println(number1.add(a, b));
		// This causes an exception
		// System.out.println(number1.add("a",b));
		// You need to add more test cases

	}
}
