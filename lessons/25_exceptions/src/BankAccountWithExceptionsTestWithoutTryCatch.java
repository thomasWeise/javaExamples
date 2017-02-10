/** testing the exception-throwing bank account */
public class BankAccountWithExceptionsTestWithoutTryCatch {
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    BankAccountWithExceptions account;
    
    account = new BankAccountWithExceptions("123"); //$NON-NLS-1$
    
    System.out.println(account);     // (123: 0)
    account.deposit(900_000_00L);
    System.out.println(account);     // (123: 90000000)
    account.deposit(11_000_000_00L); // here, an exception is thrown and all further transactions are skipped
    System.out.println(account);     // never reached, as the above line throws an exception and the program
                                     //                terminates, printing the stack trace to stderr
    account.withdraw(900_00L);       // never reached
    System.out.println(account);     // never reached
    account.withdraw(3_000_00L);     // never reached
    System.out.println(account);     // never reached
  }
}
