package week11;


/**
 * Auto Generated Java Class.
 */
public class TwoDimensional {
  
  
  public static void main(String[] args) { 
    
    //int [] nums = new int[10];
    //String [] strs = new String[10];
    
    int [] myNums = { 1 ,2, 3, 4, 5};
    
    // reverse an array
    int num = 7;
    double num2 = 4.9;
    System.out.println( (double) num);
    System.out.println( (int) num2);
    int [][] nums = { {1,2}, {8,9} };
    
    System.out.println( nums[0][0] );
    System.out.println( nums[1][1] );
    
    String [][] strs = { {"stewey","brian"}, {"meg","chris"} };
    
    int [][] pixels = new int[1000000][3];
    
    for( int i=0; i<1000000; i++)
    {
       for( int j=0; j<3; j++)
       {
         pixels[i][j] = 7;
       }
    }
    
    System.out.println( pixels[999999][2]);
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
