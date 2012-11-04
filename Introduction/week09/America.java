package week09;

import java.io.PrintWriter;
public class America {
  
  
  public static void main(String[] args) throws Exception { 
    PrintWriter pw = new PrintWriter("america.ppm");
    int width = 600;
    int height = 403;
    pw.println("P3");
    pw.println("# yay! I am creating my own image");
    pw.println(width + " " + height);
    pw.println("255");
    
    printBlueRed(width,height,pw);
    printBlueWhite(width,height,pw);
    printBlueRed(width,height,pw);
    printBlueWhite(width,height,pw);
    printBlueRed(width,height,pw);
    printBlueWhite(width,height,pw);
    printBlueRed(width,height,pw);
    
    printWhite(width,height,pw);
    printRed(width,height,pw);
    printWhite(width,height,pw);
    printRed(width,height,pw);
    printWhite(width,height,pw);
    printRed(width,height,pw);
    pw.close();
  }
  
  public static void printRed(int width, int height, PrintWriter pw)
  {
    for(int i=0; i<height/13; i++)
    {
       for(int j=0; j<width; j++)
       {
          pw.println("255");
          pw.println("0");
          pw.println("0");
       }
    }
  }
  
  public static void printWhite(int width, int height, PrintWriter pw)
  {
    for(int i=0; i<height/13; i++)
    {
       for(int j=0; j<width; j++)
       {
          pw.println("255");
          pw.println("255");
          pw.println("255");
       }
    }
  }
  
  public static void printBlueWhite(int width,
                                    int height, PrintWriter pw)
  {
     for(int i=0; i<height/13; i++)
     {
      for(int j=0; j<(int)(width*0.4); j++)
      {
        pw.println("0");
        pw.println("0");
        pw.println("255");
      }
      
      for(int j=0; j<(int)(width*0.6); j++)
      {
        pw.println("255");
        pw.println("255");
        pw.println("255");
      }
    }
  }
  
  public static void printBlueRed(int width, 
                             int height, PrintWriter pw) {
    for(int i=0; i<height/13; i++)
    {
      for(int j=0; j<(int)(width*0.4); j++)
      {
        pw.println("0");
        pw.println("0");
        pw.println("255");
      }
      
      for(int j=0; j<(int)(width*0.6); j++)
      {
        pw.println("255");
        pw.println("0");
        pw.println("0");
      }
    }
  }
  
}
