/** Example for printing the command line arguments<br/>
 * Eclipse: "Run As" -> "Run Configurations..." -> Java Application
 *                   -> new -> (x)= arguments -> program arguments
 *                   (type arguments space-separated in that field) */
public class PrintCommandLineArguments {
  
  /**The main routine
   * @param args
   *          the command line arguments of the program (no longer ignored ^_^) */
  public static final void main(String[] args) {
    System.err.println("There were " + //$NON-NLS-1$
        args.length + // the number of command line arguments
        " command line arguments."); //$NON-NLS-1$

    for (String arg : args) { // iterate over the command line arguments
      System.out.println(arg);// print the current iteration element
    }
  }
}
