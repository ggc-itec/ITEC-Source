package week01;

public class StockCommission 
{
  public static void main(String[] args)
  {
    int shares = 600;
    double pricePerShare = 21.77;
    double commissionRate = 0.02;
    double stockPrice = shares*pricePerShare;
    System.out.printf( "$" + "%.2f" + " for stock alone\n"
                     , stockPrice);
    double commission = stockPrice*commissionRate;
    System.out.printf( "$" + "%.2f" + " for commission\n",
                      commission);
    double totalPaid = stockPrice + commission;
    System.out.printf( "$" + "%.2f" + " total price paid\n",
                      totalPaid);
  }
  
  
}