/** our own exception class inheriting from Exception, i.e., being a checked exception */
public class CheckedTransactionException extends Exception {

  /**the serial version uid: don't worry about that right now */
  private static final long serialVersionUID = 1L;
  
  /** the bank account */
  final BankAccountWithCheckedExceptions account;

  /** create the exception */
  public CheckedTransactionException(String message, BankAccountWithCheckedExceptions _account) {
    super(message);
    this.account = _account;
  }
}
