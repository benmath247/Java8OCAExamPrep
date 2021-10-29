package chapter2.operators;

public class AdditionalBinaryOperators {
    public static void main(String[] args){
        /*
        logical operators:
        | or
        & and
        ^ exclusive or, meaning if both are true, returns false

        &&, || are shortcircuit operators meaning that if the left side determines answer, the right side is not
        evaluated.

        using logical instead can help protect against exceptions.
         */

        int x = 6;
        boolean y = (x >= 6) || (++x <= 7);
        System.out.print(x); //returns 6 because right side was never evaluated
    }
}
