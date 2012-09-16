package week4;

//From Cay Horstmann's Big Java 4th edition

/**
   An account that earns interest at a fixed rate.
*/
public class SavingsAccount extends BankAccount
{  
   private double interestRate;

   /**
      Constructs a bank account with a given interest rate.
      @param rate the interest rate
   */
   public SavingsAccount(double rate) 
   {  
      interestRate = rate;
   }

   /**
      Adds the earned interest to the account balance.
   */
   public void addInterest() 
   {  
      double interest = getBalance() * interestRate / 100;
      deposit(interest); 
   }
}
