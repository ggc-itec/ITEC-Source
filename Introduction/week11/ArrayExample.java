package week11;

import java.util.Random;
public class ArrayExample {
  
  
  public static void main(String[] args) { 

    //int [] nums = { 1 , 2 , 3 };
    
    int [] nums = new int[10];
    boolean [] bools = new boolean[100];
    String [] strs = new String[300];
    double [] ds = new double[50];
    
    Random random = new Random();
    for(int i=0; i<nums.length; i++)
    {
      ds[i] = random.nextDouble();
    }
    
    System.out.println(ds[0]);
    System.out.println(ds[1]);
    
    for(int i=0; i<nums.length; i++)
    {
       nums[i] = i; 
    }
    
    System.out.println(nums[2]);
  }
  

  
}
