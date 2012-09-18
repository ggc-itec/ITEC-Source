package week02;

import java.util.Scanner;

public class MethodExample {

	public static int add(int a,int b)
	{
		return a+b;
	}
	
	
	public static void main(String[] args) {
		
		double pounds = 150;
		
		System.out.println( UnitConversion.getKilograms(pounds) );
		
		Student gizzly = new Student(123456789);
		gizzly.setName("General");
		gizzly.setAge(6);
		System.out.println(gizzly.getStudentTag());
		
		System.out.println(add(5,5));
	}

}
