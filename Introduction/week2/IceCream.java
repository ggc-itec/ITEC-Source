package week2;

import javax.swing.JOptionPane;

public class IceCream {
  
  
  public static void main(String[] args) { 
    
	// can you see the difference between showMessageDialog() and showConfirmDialog() ?
    //JOptionPane.showMessageDialog(null,"Do you like ice cream?");
    //int num = JOptionPane.showConfirmDialog(null, "YES/NO?");
    
    int num = JOptionPane.showConfirmDialog(null, "Do you like ice cream?");
    
    //Constants
    //System.out.println(JOptionPane.YES_OPTION);
    //System.out.println(JOptionPane.NO_OPTION);
    
    if( num == JOptionPane.YES_OPTION )
    {
       JOptionPane.showMessageDialog(null,"Duh~ Who doesn't");
    }
    else
    {
       JOptionPane.showMessageDialog(null,"Meh~ That's too bad");
    }
  }
  
}
