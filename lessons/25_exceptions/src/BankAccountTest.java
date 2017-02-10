/** testing the plain bank account class */
public class BankAccountTest {
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    BankAccount account;
    
    account = new BankAccount("123"); //$NON-NLS-1$
    
    System.out.println(account);     // (123: 0)
    account.deposit(900_000_00L);
    System.out.println(account);     // (123: 90000000)
    account.deposit(11_000_000_00L); // Invalid deposit amount 1100000000 for account (123: 90000000)
    System.out.println(account);     // (123: 90000000) <---| notice how the program continues, although
                                     //                     | the 11'000'000 RMB have not been added to
    account.withdraw(900_00L);       //                     | the account, which now has a different value
    System.out.println(account);     // (123: 89910000)     | from what the user exceptions?
    account.withdraw(3_000_00L);     // Invalid withdrawal amount 300000 for account (123: 89910000)
    System.out.println(account);     // (123: 89910000)
  }
}
