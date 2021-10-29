package chapter2.operators;

public class IncrementDecrement {
    public static void main(String[] args) {

        int counter = 0;

        System.out.println(counter);
        System.out.println(counter++);
        System.out.println(++counter);
        System.out.println(counter++);

        System.out.println("------------\n\n");
        int x = 3;
        int y = ++ x * 5 / x-- + --x;

        System.out.println("y = " + y + "\nx = "+ x);
        // y = 4 * 5 / x-- + --x    // x = 4
        // y = 4 * 5 / 4 + --x      // x = 3
        // y = 4 * 5 / 4 + 2       // x = 2
        // y = 5 + 2
        // y = 7 // x = 2
    }

}
