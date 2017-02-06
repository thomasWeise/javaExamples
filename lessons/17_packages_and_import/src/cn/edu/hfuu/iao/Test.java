package cn.edu.hfuu.iao;

import java.util.Scanner; // import class Scanner from the java.util package

import cn.edu.hfuu.iao.io.ForeignExchangeStudentReader;
import cn.edu.hfuu.iao.io.PersonReader;
import cn.edu.hfuu.iao.io.ProfessorReader;
import cn.edu.hfuu.iao.io.StudentReader;
import cn.edu.hfuu.iao.person.Person;

/** testing our package structure */
public class Test {
  /** The main routine
   *  @param args
   *          we ignore this parameter */
  public static void main(String[] args) {
    PersonReader reader;
    Scanner scanner = new Scanner(System.in);
    
    System.err.println("Do you want to read (p)rofessors, (s)tudents, or (e)change students: "); //$NON-NLS-1$
        
    switch(scanner.nextLine().charAt(0)) {
      case 'p': { reader = new ProfessorReader(); break; }
      case 's': { reader = new StudentReader(); break; }
      default:  { reader = new ForeignExchangeStudentReader(); break; }
    }
    
   for(;;){
      Person person = reader.read(scanner);
      System.out.println("You entered: " + person); //$NON-NLS-1$
      System.out.println("Type enter to continue, Ctrl-D to exit."); //$NON-NLS-1$
      if(scanner.hasNextLine()){
        scanner.nextLine();
      } else { return; }
   }
  }
}
