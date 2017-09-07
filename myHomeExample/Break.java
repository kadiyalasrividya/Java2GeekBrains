/**
 * Java. My test from JavaRush 
 * Java Book. Mike McGrath
 * Java programming easy steps
 * @author Iurii Leskovetc
 * @version 1.0 dated Sep 07, 2017
 */
 
// Using break as form of goto.
public class Break {

  public static void main(String[] args) {
    boolean t = true;
    first:
    {
      second:
      {
        third:
        {
          System.out.println("Befor operator break.");
          if (t) {
            break second; // exit from block second
          }
          System.out.println("Not using");
        }
        System.out.println("Not using");
      }
      System.out.println("Operator use after block second.");
    }
  }
}