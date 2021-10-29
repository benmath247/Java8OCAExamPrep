package chapter2.operators;

public class BinaryOperators {

    //assignment operator is a binary operator that mods or assigns the variable on the left. such as =, +=, -=, etc.
    public static void main(String args[]) {
        //DOES NOT COMPILE:
//        int x = 1.0; // cant use decimal
//        short y = 1921222; // too big
//        int z = 9f; //written as a float
//        long t = 192301398103810323; // interpreted as an int because no "L" and too big

        //CASTING SOLVES COMPILATION ISSUES:
        int x = (int) 1.0;
        short y = (short) 1921222; // stored as 20678 because of overflow. wraps around to the lowest value and counts up
        int z = (int) 9f;
        long t = 192301398103810323L;

        //casting prevents overflow and underflow

    }
}
