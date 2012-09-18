package week01;

public class EnergyDrink
{
  public static void main( String[] args )
  {
    int numOfCustomers = 12467;
    
    double numOfEnergyCust = numOfCustomers*0.14;
    
    System.out.printf("%.0f " + "enjoy energy drinks "
                         + "every week\n", numOfEnergyCust);

    double numOfCitrus = numOfEnergyCust * 0.64;
    
    System.out.printf("%.0f " + 
                       "enjoy a citrus energy drink\n", 
    numOfCitrus);
  }
  
  
  
}