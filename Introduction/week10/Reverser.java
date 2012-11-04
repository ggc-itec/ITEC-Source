package week10;

/**

 * Auto Generated Java Class.
 */
import java.util.Arrays;

public class Reverser {
  public static void main(String[] args) { 
    int [] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    
    //int [] reversed = new int[10];
    
    int pos = 0;
    for( int i=0; i< nums.length/2; i++)
    {
      int temp = nums[i];
      nums[i] = nums[nums.length-1-i];
      nums[nums.length-1-i] = temp;
      
    }
    
    System.out.println(Arrays.toString(nums));
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
