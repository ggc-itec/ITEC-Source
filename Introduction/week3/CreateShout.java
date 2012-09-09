package week3;

import javax.swing.JOptionPane;
public class CreateShout {
  
  public static void main(String[] args) { 
    String str;
    str = JOptionPane.showInputDialog("Please enter a string");
    
    String strUp = str.toUpperCase();
    JOptionPane.showMessageDialog(null,"You said: " + strUp);
  }
  

  
}
