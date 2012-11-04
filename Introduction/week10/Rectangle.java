package week10;

/**
 * Auto Generated Java Class.
 */
public class Rectangle {
  
  /* ADD YOUR CODE HERE */
  
  double height;
  double width;
  
  public void setHeight(double h)
  {
     height = h;
  }
  
  public void setWidth(double w)
  {
     width = w; 
  }
  
  public double getArea() {
      return height*width; 
  }
  
  public double getLength() {
      return 2*height + 2*width; 
  }
  
}
