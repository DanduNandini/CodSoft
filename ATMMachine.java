import java.util.Scanner;
class BankAccount
{
   private double balance;
   public BankAccount(double initialBalance)
   {
      this.balance= initialBalance;
   }
   public double getBalance()
   {
      return balance;
   }
   public void deposit(double amount)
   {
      if (amount>0)
      {
         balance +=amount;
         System.out.println("Deposit successful.Yor new balance is:"+balance);
      }
      else
      {
         System.out.println("Invalid deposit amount.");
      }
   }
   public Boolean withdraw(double amount)
   {
      if (amount>0 && amount<=balance)
      {
         balance-=amount;
         System.out.println("Withdrawal successful.Your new balance is:"+balance);
         return true;
      }
      else if(amount>balance)
      {
         System.out.println("Insufficient balance for withdrawal.");
         return false;
      }

      System.out.println("Invalid withdrawal amount .");
      return false;
   }
}
class ATM
{
   private BankAccount account;
   public ATM(BankAccount account)
   {
      this.account= account;
      System.out.println("Welcome to the ATM");
      System.out.println("1.Check balance");
      System.out.println("2.Deposit");
      System.out.println("3.Withdraw");
      System.out.println("4.Exit");
   }
   public void displayMenu()
   {
      System.out.println("\n ATM Menu: ");
      System.out.println("1.Check balance");
      System.out.println("2.Deposit");
      System.out.println("3.Withdraw");
      System.out.println("4.Exit");
   }
   public void checkBalance()
   {
      System.out.println("Your current balance is: "+account.getBalance());
   }
   public void deposit (double amount)
   {
      account.deposit(amount);
   }
   public void withdraw(double amount)
   {
      account.withdraw(amount);
   }
   public void start()
   {
      Scanner sc = new Scanner(System.in);
      boolean exit=false;
    while (!exit)
   {
      displayMenu();
      System.out.print("Please choose an option: ");
      int choice = sc.nextInt();
      switch(choice){
         case 1:
            checkBalance();
            break;
         case 2:
            System.out.print("Enter amount to deposit :");
            double depositAmount = sc.nextDouble();
            deposit(depositAmount);
            break;
         case 3:
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount=sc.nextDouble();
            withdraw(withdrawAmount);
            break;
         case 4:
            System.out.println("Thank you for using the ATM.Goodbye!");
            exit=true;
            break;
         default:
            System.out.println("Tnvalid option.Please try again.");
        }
    }
     sc.close();
  }
}
public class ATMMachine {
   public static void main(String [] args)
   {
      BankAccount account=new BankAccount(1000.0);
      ATM atm=new ATM(account);
      atm.start();
   }
}


