package week07;

/**
 * Auto Generated Java Class.
 */
public class LoopExample3 {
  
  
  public static void main(String[] args) { 
    String str = "Good afternoon!";
    
    char c = '!';
    int len = str.length();
    int i=0;
    int count = 0;
    while(i<len)
    {
       if( str.charAt(i) == '!' ) 
       {
          count = count + 1; 
       }
       i = i +1;
    }
    System.out.println("Found: " + count);
  }
  
  /* ADD YOUR CODE HERE */
  
}
