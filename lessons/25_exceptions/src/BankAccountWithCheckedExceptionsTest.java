/** testing the checked-exception throwing bank account with check exceptions: MUST have try...catch */
public class BankAccountWithCheckedExceptionsTest {
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    BankAccountWithCheckedExceptions account;
    
    account = new BankAccountWithCheckedExceptions("123"); //$NON-NLS-1$
    
    try { // without this try...catch, this class cannot be compiled anymore!
      System.out.println(account);     // (123: 0)
      account.deposit(900_000_00L);
      System.out.println(account);     // (123: 90000000)
      account.deposit(11_000_000_00L); // here, an exception is thrown and all further transactions are skipped
      System.out.println(account);     // never reached

      account.withdraw(900_00L);       // never reached
      System.out.println(account);     // never reached
      account.withdraw(3_000_00L);     // never reached
      System.out.println(account);     // never reached
    } catch (CheckedTransactionException trans) { // Invalid deposit amount 1100000000 for bank account (123: 90000000)
      System.out.println(trans.getMessage() + " for bank account " + trans.account); //$NON-NLS-1$
    }
  }
}
