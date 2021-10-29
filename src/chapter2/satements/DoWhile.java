package chapter2.satements;

public class DoWhile {
    /*
    This is similar to a while loop except it guarantees that the block is executed at least once.
     */
    public static void main(String[] args){
        int x = 0;
        do {
            x++;
        } while (false);
        System.out.println(x); //returns 1 because the block runs no matter what
    }
}
