/**
 * Java. My test from JavaRush 
 * Java Book. Mike McGrath
 * Java programming easy steps
 * @author Iurii Leskovetc
 * @version 1.0 dated Sep 07, 2017
 */

// Using break for exit of loop.
public class BreakLoop {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 4) {
            break; // end loop, if i = 4
            }
        System.out.println("i: " + i);
        }
    System.out.println("End of loop for.");
    
    int i = 0;
        while (i < 100) {
            if (i == 5) {
            break; // end loop, if i = 5
            }
        System.out.println("i: " + i);
        i++;
        }
   System.out.println("End of loop while.");
   
   for (int id = 0; id < 3; id++) {
      System.out.print("Iteration " + id + ": ");
      for (int j = 0; j < 10; j++) {
        if (j == 6) {
          break; // end loop, if id = 6
        }
        System.out.print(j + " ");
      }
      System.out.println();
    }
    System.out.println("End of nested loop for.");
    }
}