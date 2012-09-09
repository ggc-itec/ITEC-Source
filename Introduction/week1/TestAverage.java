package week1;

import java.util.Scanner;
  
public class TestAverage {
  
  public static void main( String[] args )
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first grade");
    int grade1 = scanner.nextInt();
    System.out.println("Enter second grade");
    int grade2 = scanner.nextInt();
    System.out.println("Enter third grade");
    int grade3 = scanner.nextInt();
    
    double average = (grade1+grade2+grade3)/3;
    System.out.println("The average is " + average);
  }
  
}