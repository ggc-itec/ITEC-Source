package week4;

import java.text.DecimalFormat;
/**
 * Auto Generated Java Class.
 */
public class FormatExample {
  
  
  public static void main(String[] args) { 
    double d = 13.3789;
    
    System.out.printf("This is my price %.2f \n", d);
    
    DecimalFormat formatter = new DecimalFormat(".##");
    System.out.println(formatter.format(d));
  }
  
  /* ADD YOUR CODE HERE */
  
}
