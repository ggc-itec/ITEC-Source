package week08;

import javax.swing.JOptionPane;
public class UserLoop {
  
  
  public static void main(String[] args) { 
    
    while( true )
    {
      String age = JOptionPane.showInputDialog("Enter you age");
      int ageNum = Integer.parseInt(age);
      
      if( ageNum > 30 ) 
      {
        JOptionPane.showMessageDialog(null,"Hey! Old dude!");
      }
      else
      {
        JOptionPane.showMessageDialog(null,"Hey! Young dude!");
      }
     }
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
