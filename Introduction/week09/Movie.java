package week09;


import javax.swing.JOptionPane;

public class Movie {
  
  public static void seeMovie(int stars, double price) {
    
    if( stars==5 && price < 12)
    {
      System.out.println("sort of interested"); 
    }
  }
  
  
  public static void main(String[] args) { 
    
    while(true)
    {
      String starStr = JOptionPane.showInputDialog("Num stars");
      String priceStr = JOptionPane.showInputDialog("Num price");
      
      int stars = Integer.parseInt(starStr);
      double price = Double.parseDouble(priceStr);
      
      seeMovie(stars,price);
    }
  }
  
  /* ADD YOUR CODE HERE */
  
}
