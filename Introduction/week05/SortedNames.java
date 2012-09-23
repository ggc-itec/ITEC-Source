package week05;

import javax.swing.JOptionPane;

public class SortedNames {
  public static void main(String[] args) { 
    
    String first = "";  //empty string
    String second = "";
    String third = "";
    
    String name1 = JOptionPane.showInputDialog("Enter name1");
    String name2 = JOptionPane.showInputDialog("Enter name2");
    
    if( name1.compareTo(name2) >= 0 )
    {
      first = name2;
      second = name1;
    }
    else
    {
      first = name1;
      second = name2;
    }
    
    String name3 = JOptionPane.showInputDialog("Enter name3");
    
    if( name3.compareTo(first) >= 0 )
    {
       // first stays same determine second and third 
      if( name3.compareTo(second) >= 0 )
      {
         third = name3; 
      }
      else
      {
         String temp = second;
         second = name3;
         third = temp;
      }
    }
    else
    {
      String temp = first;
      String temp2 = second;
      first = name3;
      second = temp;
      third = temp2;
    }
  
  
  JOptionPane.showMessageDialog(null,"Sorted \n" + first
                                  + "\n" + second + 
                                "\n" + third);
  }
}
