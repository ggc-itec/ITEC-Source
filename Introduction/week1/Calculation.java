package week1;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;
public class Calculation {
  public static void main(String[] args) { 
    String str = "Night Class";
    String mystr = " Is Fun";
    System.out.println("24 degree celcius");
    System.out.println( 24 * 9.0/5 + 32);
    
    Date mydate = new Date();
    System.out.println(mydate);
    Random r = new Random();
    int num = r.nextInt(10);
    System.out.println(num);
    System.out.println( Math.pow(100,2) );
    System.out.println( Math.abs(-100) );
    System.out.println( Math.abs(num) );
    System.out.println( Math.min(3,9) );
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number");
    int mynum = scanner.nextInt();
    System.out.println("You entered: " + mynum);
  }
  
}
