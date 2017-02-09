/** our own exception class */
public class TransactionException extends IllegalArgumentException {

  /**the serial version uid: don't worry about that right now */
  private static final long serialVersionUID = 1L;
  
  /** the bank account */
  final BankAccountWithExceptions account;

  /** create the exception */
  public TransactionException(String message, BankAccountWithExceptions _account) {
    super(message);
    this.account = _account;
  }
}
