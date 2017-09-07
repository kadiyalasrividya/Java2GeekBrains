/**
 * Java. My test from JavaRush 
 * Java Book. Mike McGrath
 * Java programming easy steps
 * @author Iurii Leskovetc
 * @version 1.0 dated Sep 07, 2017
 */
 
// Using option args.

class Option {

    public static void main(String[] args) {
        try
        {
            if(args[0].equals("-en"))
            {
                System.out.println("Options for English");
            }
            else if(args[0].equals("-ru"))
            {
                System.out.println("Options for Russian");
            }
            else System.out.println("Unkwoun options");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Not choice options");
        }
    }
}
/*
java Option -ru
Process started >>>
Options for Russian

java Option
Process started >>>
Not choice options
*/