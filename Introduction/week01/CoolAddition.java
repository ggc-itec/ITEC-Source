package week01;

public class CoolAddition {
  
  public static void main( String[] args)
  {
    add(1,2);
    add(3,5);
    add(12312,12312);
    add(12321,12312312);
    add(-23,234);
  }
  
  public static void add( int a, int b )
  {
     int total = a + b;
     System.out.println("The total is " + total);
  }
  
}