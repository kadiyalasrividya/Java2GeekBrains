/**
 * Java. My test from JavaRush 
 * Java Book. Mike McGrath
 * Java programming easy steps
 * @author Iurii Leskovetc
 * @version 1.0 dated Sep 07, 2017
 */
 
// Using args main.

class Args {

    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("Not correct args");
            return;
        }
        
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);

        String msg = args[0] + args[1] + args[2] + "=";

        if(args[1].equals("+")) msg += (num1 + num2);
        else if(args[1].equals("-")) msg += (num1 - num2);
        else if(args[1].equals("x")) msg += (num1 * num2);
        else if(args[1].equals("/")) msg += (num1 / num2);
        else msg = "Not corrrect operator";
        
        System.out.println(msg);
        
        System.out.println("args[0] is: " + args[0]);
        System.out.println("args[1] is: " + args[1]);
        System.out.println("args[2] is: " + args[2]);
    }
}
/*
java Args 15 x 4
Process started >>>
15x4=60
args[0] is: 15
args[1] is: x
args[2] is: 4
=============
with "*" error
*/