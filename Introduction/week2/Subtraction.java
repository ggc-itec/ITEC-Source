package week2;

public class Subtraction {
    
  public static void main(String[] args) { 
       
      int i = subtractTwoNumbers(100,-200);
      System.out.println("The result is " + i);
  }
  
  public static int subtractTwoNumbers(int x, int y )
  {
      int total = x - y;
      return total;
  }
  
}
