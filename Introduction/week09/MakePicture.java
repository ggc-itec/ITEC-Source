package week09;

import java.io.PrintWriter;

public class MakePicture {
  
  
  public static void main(String[] args) throws Exception { 
    
    PrintWriter output = new PrintWriter("red.ppm");
    output.println("P3");
    output.println("# red image");
    output.println("800 600");
    output.println("255");
    
    for(int i=0; i<800; i++)
    { 
       for(int j=0; j<200; j++)
       {
          output.println("255");
          output.println("0");
          output.println("0");
       }
    }
    
    
    output.close();
  }
  
  /* ADD YOUR CODE HERE */
  
}
