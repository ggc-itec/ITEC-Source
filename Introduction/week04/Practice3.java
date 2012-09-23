package week04;

/**
 * Auto Generated Java Class.
 */
public class Practice3 {
  
  
  public static void main(String[] args) { 

    double x = 1.2;
    double y = 2.6;
    double z = 3;
    
    // we need to determine first, second, third
    // this is the hard way
    // can you make this program simpler by using Math.max() and Math.min() ?
    
    double first;
    double second;
    double third;
    
    if( x <= y && x <= z)
    {
        first = x;
        if( y <= z)
        {
          second = y;
          third = z;
        }
        else
        {
          second = z;
          third = y;
        }
    }
    else if( y <= z && y <= x )
    {
       first = y;
       if( x <= z)
       {
         second = x;
         third = z;
       }
       else
       {
         second = z;
         third = x;
       }
    }
    else
    {
       first = z;
       if( x <= y)
       {
          second = x;
          third = y;
       }
       else
       {
         second = y;
         third = x;
       }
    }
    
    System.out.println(first);
    System.out.println(second);
    System.out.println(third);
    
  }
  

  
}
