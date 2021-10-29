package chapter2.satements;

public class Statements {
    public static void main(String[] args){
        /* a Java statement is a complete unit of execution in JAva terminaded with a semicolon.
        Control flow controls the dlow of statements with decision making, loops, branching, etc.

        a block of code is a group of zero or more statements between {} and can be used anywhere that a statement is
        allowed

        **sometimes if statements do not have brackets but the code is still part of the control flow until the first
        statement ends
         */

        int hourOfDay = 12;
        int morningGreetingCount = 0;
        if (hourOfDay < 11)
                System.out.print("Good Morning");
                morningGreetingCount++;

        System.out.println(morningGreetingCount); // prints 1 because line 19 prints no matter what. no {}

        /*
        tricks to watch for on the exam: code in an if statement is not a boolean statement.

        Ex:

        int x = 1;
        if(x) { //does not compile bc not a boolean statement
            ...
        }

        if (x = 5) {...} //does not compile bc not a boolean statement
         */
    }
}
