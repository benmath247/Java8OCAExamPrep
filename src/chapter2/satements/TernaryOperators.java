package chapter2.satements;
// ternary operators are ?: statements
public class TernaryOperators {

    /*
    booleanstatement ? executeIfTrue : executeIfFalse

     */
    public static void main(String[] args) {
        int y = 10;
        int x = (y > 5) ? (2 * y) : (3 * y); //does not *require* ()
        System.out.println((y > 5) ? 21 : "Zebra"); //prints 21. return type does not matter
        //int animal = (y<91) ? 9 : "Horse" //will not compile even though horse is not used beacause horse is the wrong
        //data type
    }
}
