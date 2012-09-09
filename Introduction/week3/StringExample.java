package week3;

public class StringExample {
  
 
  public static void main( String[] args )
  {
    String str = "Hello!";
    int len = str.length();
    System.out.println("The length of my string is " + len);
    String str2 = "Hello World";
    System.out.println("Length of my other string is " +
                       str2.length() );
    char firstChar = str.charAt(0);
    System.out.println("First char of str is " + firstChar);
    System.out.println("Second char of str is " + 
                       str.charAt(1) );
    int lastIndex = str2.length()-1;
    System.out.println("Last char of str2 is " + 
                       str2.charAt(lastIndex) );
  }
  
}