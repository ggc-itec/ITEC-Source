package week05;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class AskUser {
  
  
  public static void main(String[] args) { 
    // prompt user for a string
    // print out the string without first two chars
    String myStr;
    String str = JOptionPane.showInputDialog("Enter a string");
    String last = str.substring(2);
    JOptionPane.showMessageDialog(null, 
                                  "You just typed " + last
                                 + " at the end");
  }
  
  /* ADD YOUR CODE HERE */
  
}
