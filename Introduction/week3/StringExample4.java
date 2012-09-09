package week3;

public class StringExample4 {
  
  public static void main(String[] args) { 
    String str = "Hello World";
    String part = str.substring(0,1);
    System.out.println(part);
    int len = str.length();
    String part2 = str.substring(1);
    System.out.println(part2);
  }
}
