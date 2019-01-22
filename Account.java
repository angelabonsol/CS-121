import java.text.NumberFormat;

public class Account
{
   private final double RATE = 0.035;  // interest rate of 3.5%

   private long acctNumber;
   private double balance;
   private String name;

   //Sets up the account: owner, account number, initial balance.
   public Account(String owner, long account, double initial)
   {
      name = owner;
      acctNumber = account;
      balance = initial;
   }

 //Deposits an amount into the account; returns the new balance.
   public double deposit(double amount)
   {
      balance = balance + amount;
      return balance;
   }

   //Withdraws amount from account, applies fee, returns balance
   public double withdraw(double amount, double fee)
   {
      balance = balance - amount - fee;
      return balance;
   }
   // Adds interest to the account and returns the new balance.
   public double addInterest()
   {
      balance += (balance * RATE);
      return balance;
   }

   //  Returns the current balance of the account.
   public double getBalance()
   {
      return balance;
   }

   //Returns a one-line description of the account as a string.
   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
   }
   
}
