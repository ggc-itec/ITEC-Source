package week08;

public class IsPrime {
  public static boolean isPrime(int n){
    int num = (int) Math.pow(n, 0.7);
    int check = 0;
    for(int i=1;i<num; i++)
    {
      if(n% i == 0)
        check = check + 1;
    }
    if(check ==1)
    {
      
      return true;
    }
    else
    {
      return false;
    }
  }
  public static void main(String[] args) {
    if(isPrime(21) == true)
    {
      System.out.println("Is Prime");
    }
    else
    {
      System.out.println("Is not Prime");
    }
  }
}