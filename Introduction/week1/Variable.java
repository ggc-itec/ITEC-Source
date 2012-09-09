package week1;

public class Variable
{
  public static void main(String[] args)
  {
     // calculating tip
     // your dinner is pretax bill is 45.80 dollars
     // tax is 6 %
     // tip is 20%
     // print out tax
     // print out tip
     // print out the total bill
    double pretaxBill = 45.8;
    double tax = pretaxBill * 0.06;
    System.out.println("Tax is $" + tax);
    double tip = pretaxBill * 0.2;
    System.out.println("Tip is $" + tip);
    double totalBill = pretaxBill + tax + tip;
    System.out.println("Total bill is $" + totalBill);
  }
  
  
}