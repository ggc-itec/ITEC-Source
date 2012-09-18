package week02;

public class MethodExample2 {  
  
  public static void main(String[] args) { 
    addTwoNumbers(1,2);
    // call the method addTwoNumbers 
    // with arguments 100, 200
    addTwoNumbers(100,200);
  }
  
  public static void addTwoNumbers(int jack, int jill) 
  {
    int total = jack + jill ;
    System.out.println("The sum is " + total);
  }
  
}
