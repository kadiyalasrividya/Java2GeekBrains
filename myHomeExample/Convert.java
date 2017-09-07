/**
 * Java. My test from JavaRush 
 * Java Book. Mike McGrath
 * Java programming easy steps
 * @author Iurii Leskovetc
 * @version 1.0 dated Sep 07, 2017
 */
 
// Using convert types.

class Convert {

    public static void main(String[] args) {
        float daysFloat = 365.25f;
        String weeksString = "52";
        String PI = "3.1412";
        
        int daysInt = (int) daysFloat;
        int weeksInt = Integer.parseInt(weeksString);
        int week = (daysInt / weeksInt);
        
        System.out.println("Days of week: " + week);
        
        float pipi = Float.parseFloat(PI);
        float square = pipi * 2;
        System.out.println("Square is: " + square);
    }
}
/*
result code:
Days of week: 7
Square is: 6.2824
*/