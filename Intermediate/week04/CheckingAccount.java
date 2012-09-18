package week04;

//From Cay Horstmann's Big Java 4th edition

/**
   A checking account that charges transaction fees.
*/
public class CheckingAccount extends BankAccount
{  
   private static final int FREE_TRANSACTIONS = 3;
   private static final double TRANSACTION_FEE = 2.0;

   private int transactionCount;

   /**
      Constructs a checking account with a given balance.
      @param initialBalance the initial balance
   */
   public CheckingAccount(double initialBalance)
   {  
      // Construct superclass
      super(initialBalance);
      
      // Initialize transaction count
      transactionCount = 0; 
   }

   public void deposit(double amount) 
   {  
      transactionCount++;
      // Now add amount to balance 
      super.deposit(amount); 
   }
   
   public void withdraw(double amount) 
   {  
      transactionCount++;
      // Now subtract amount from balance 
      super.withdraw(amount); 
   }

   /**
      Deducts the accumulated fees and resets the
      transaction count.
   */
   public void deductFees()
   {  
      if (transactionCount > FREE_TRANSACTIONS)
      {  
         double fees = TRANSACTION_FEE *
               (transactionCount - FREE_TRANSACTIONS);
         super.withdraw(fees);
      }
      transactionCount = 0;
   }
}
