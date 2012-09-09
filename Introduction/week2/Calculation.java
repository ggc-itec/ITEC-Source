package week2;

/**
 * Auto Generated Java Class.
 */
public class Calculation {
  
  
  public static void main(String[] args) { 
    
    // 42.8
    
    double number = 42.8;
    double number2 = -42.7;
    //System.out.printf("%.0f",number);
    double truncated = Math.floor(number);
    // Math.abs()
    double abs = Math.abs(number2);
    // Math.ceil()
    // 36.1
    double ceiled = Math.ceil(36.1);
    // 2^5 = 32
    // Math.pow( base, power )
    double powed = Math.pow(2,5);
    System.out.println(abs);
    System.out.println(truncated);
    System.out.println("Ceiled value is " + ceiled);
    System.out.println("Powed 2 to 5 is " + powed);
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
