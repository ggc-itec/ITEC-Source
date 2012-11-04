package week10;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Rotate {
  
  
  public static void main(String[] args) throws Exception { 
    File file = new File("car.ppm");
    Scanner scanner = new Scanner(file);
    PrintWriter pw = new PrintWriter("rotate.ppm");
    
    String magic = scanner.nextLine();
    pw.println(magic);
    
    String comment = scanner.nextLine();
    pw.println(comment);
    
    String size = scanner.nextLine();
    pw.println(size);
    String [] sizeArray = size.split(" ");
    // "hello world" ->  { "hello", "world") }
    int width = Integer.parseInt(sizeArray[0]);
    int height = Integer.parseInt(sizeArray[1]);
    
    String maxrgb = scanner.nextLine();
    pw.println(maxrgb);
    
    String [] strs = new String[width*height*3];
    int x=0;
    while( scanner.hasNextLine() )
    {
      strs[x] = scanner.nextLine();
      x += 1;
    }
    // rotate
    for(int i=strs.length-1; i>=0; i=i-3)
    {
      pw.println(strs[i-2]);
      pw.println(strs[i-1]);
      pw.println(strs[i]);
    }
    pw.flush();
  }
  

  
}
