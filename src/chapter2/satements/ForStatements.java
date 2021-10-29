package chapter2.satements;

public class ForStatements {
    public static void main(String[] args) {
        for (int initial = 0; initial < 10; initial++) {
            System.out.println(initial);
        }
    }

    /*
    1. initialization statement executes
    2. if booleanExp is true, continue else exit
    3. body executes
    4. execute third part of for loop
    5. repeat

    remember that variables declared in a for loop are only available in the for loop scope

    remember:
    1. beware of infinite loops
    2. you can add multiple terms to the for statement. ex:
        (int y = 0, z = 4; x < 5 && y < 10; x++, y++)
    3. declaring a variable twice
    4. variables in initialization block must all be the same data type!
    5. using variable declared in the for loop outside the for loop is not allowed
     */
}
