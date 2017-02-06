package cn.edu.hfuu.iao.person; // declare the package cn.edu.hfuu.iao.person

/** A class representing a foreign exchange student */
public class ForeignExchangeStudent extends Student {
  /** the home country of the student */
  String homeCountry; // we add a new field

  /** create a student record and set its name, student id, and home country */
  public ForeignExchangeStudent(String _familyName, String _givenName, 
                                String _id,         String country) {
    super(_familyName, _givenName, _id);
    this.homeCountry = country;
  }

  /** override toString() from Person */
  @Override
  public String toString() {
    return super.toString() + " from " + this.homeCountry;//$NON-NLS-1$
  }
}
