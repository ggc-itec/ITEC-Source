package week10;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class GrayScale {
  
  
  public static void main(String[] args) throws Exception { 
    File file = new File("car.ppm");
    Scanner scanner = new Scanner(file);
    PrintWriter pw = new PrintWriter("graycar.ppm");
    
    String magic = scanner.nextLine();
    pw.println(magic);
    
    String comment = scanner.nextLine();
    pw.println(comment);
    
    String size = scanner.nextLine();
    pw.println(size);
    
    String maxrgb = scanner.nextLine();
    pw.println(maxrgb);
    
    while( scanner.hasNextLine() )
    {
      String red = scanner.nextLine();
      String green = scanner.nextLine();
      String blue = scanner.nextLine();
      // Y = 0.2126 R + 0.7152 G + 0.0722 B 
      // from http://en.wikipedia.org/wiki/Grayscale
      int r = Integer.parseInt(red);
      int g = Integer.parseInt(green);
      int b = Integer.parseInt(blue);
      int gray = (int) (0.21*r + 0.71*g + 0.07*b);
      pw.println(gray);
      pw.println(gray);
      pw.println(gray);
    }
    
    pw.flush();
  }
  

  
}
