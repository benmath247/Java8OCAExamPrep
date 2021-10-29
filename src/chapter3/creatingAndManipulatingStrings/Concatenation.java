package chapter3.creatingAndManipulatingStrings;

import java.util.ArrayList;

public class Concatenation {

    public static void main(String[] args) {

        ArrayList<String> concatenationRules = new ArrayList<>();
        String concatenationRule1 = "If both operands are numberic, + means numeric addition.\n";
        String concatenationRule2 = "If either operand is a String, + means concatenation\n";
        String concatenationRule3 = "Things are evaluated left to right\n";

        concatenationRules.add(concatenationRule1);
        concatenationRules.add(concatenationRule2);
        concatenationRules.add(concatenationRule3);

        System.out.println(concatenationRules);
    }
}