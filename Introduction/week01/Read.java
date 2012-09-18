package week01;

import java.util.Scanner;

public class Read 
{
  public static void main( String[] args)
  {
    System.out.println("Please enter an integer");
    Scanner scanner = new Scanner(System.in);
    
    int input = scanner.nextInt();
    
    System.out.println("Please enter another integer");
    int input2 = scanner.nextInt();
    
    System.out.println("Please enter the third number");
    int input3 = scanner.nextInt();
    
    int total = input + input2 + input3;
    System.out.println("The sum of three nums is " + total);
  }
  
}