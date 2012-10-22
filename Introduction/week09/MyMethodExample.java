package week09;

/**
 * Auto Generated Java Class.
 */
public class MyMethodExample {
  
  /**
   * This method prints the numbers between a and b (inclusive)
   * 
   * @paran a starting number
   * @paran b ending number
   */
  public static void printNums(int a, int b) 
  {
    for(int i=a; i<=b; i++)
    {
       System.out.print(i + ", "); 
    }
    
  }
  
  /**
   * This method prints all the even numbers of 
   * x to y
   * 
   * @param x start number
   * @param y end number
   */
  public static void printEvenNums(int x, int y)
  {
    for(int i=x; i<=y; i++)
    {
      if( i%2 == 0 )
      {
         System.out.print(i + ", "); 
      }
    }
  }
    
  /**
   *  This method returns the biggest int among three args
   *  getMaxNum()
   * @param x first number
   * @param y second number
   * @param z third number
   * @return the maximum of the three input args
   */ 
  public static int getMaxNum(int x ,int y, int z)
  {
    int temp = Math.max(x,y);
    return Math.max(temp,z);
  }
  
  /**
   * This method takes the length of a string and doubles it
   * getDoubleStringLength()
   * @param str input string
   * @return double the length of string
   */ 
  public static int getDoubleStringLength(String str)
  {
      return str.length()*2; 
  }
  
  
  public static void main(String[] args) {
   
    System.out.println( getDoubleStringLength("sleepy and tired") );
    //int cat = 100;
    //int dog = 200;
    //printEvenNums(cat,dog);
    //printNums(-100000,100);
  }
  
  /* ADD YOUR CODE HERE */
  
}
