package week10;

/**
 * Auto Generated Java Class.
 */
public class ArrayExample {
  
  
  public static void main(String[] args) { 
    
    double [] nums = { 3.1, 5.2, 7.8, 56.6, 45.6, 45.6 };
    // array of doubles with three doubles in the array
    String [] strs = {  "fee", "fi", "fo" };
    
    System.out.println( nums[nums.length - 1] ); 
    System.out.println( strs[(strs.length - 1)/2] );
    
    double sum = 0;
    for(int i=0; i<nums.length; i++)
    {
      sum = sum + nums[i];
    }
    
    System.out.println(sum);
    /*
    int [] nums = new int[4];
    String [] strs = new String[3];
    System.out.println(nums[0]);
    nums[0] = 7;
    nums[1] = 8;
    nums[2] = 9;
    nums[3] = 10;
    System.out.println(strs[0]);
    strs[0] = "fii";
    strs[1] = "fee";
    strs[2] = "foo";
    */
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
