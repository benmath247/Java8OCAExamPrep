package chapter2.satements;

public class WhileStatements {
    public static void main(String[] args) {
        int x = 0;
        while(x < 10){
            System.out.println(x++);
        }

        /*
        beware infinite loops.

        int x = 2;
        int y = 5;

        while(x < 10) y++

        creates infinite loop because x will always be les than 10.
         */
    }
}
