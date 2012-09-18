package week03;

import javax.swing.JOptionPane;
public class YoungAndOld {
   
  public static void main(String[] args) { 
    String age = JOptionPane.showInputDialog("Please" 
                            + " enter your age");
    int ageNum = Integer.parseInt(age);
    if( ageNum > 42 )
    {
      JOptionPane.showMessageDialog(null,"You are OLD!");
    }
    else
    {
      JOptionPane.showMessageDialog(null,"You are YOUNG!");
    }
  }
  
 
}
