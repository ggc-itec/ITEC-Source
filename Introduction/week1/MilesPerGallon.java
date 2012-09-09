package week1;

import java.util.Scanner;

public class MilesPerGallon
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the miles driven");
    double milesDriven = scanner.nextDouble();
    System.out.println("Enter gallons used");
    double gallonUsed = scanner.nextDouble();
    
    double mpg = milesDriven/gallonUsed;
    System.out.printf("%.2f miles per gallon \n" +
                        " blah blah blah " +
                        " blah blah \n"
                        , mpg);
  }
  
}