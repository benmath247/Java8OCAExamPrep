package practice.q6;

public class Q6 {
    public static void addToInt(int x, int amountToAdd){
        x= x + amountToAdd;
    }
    public static void main(String[] args){
        int a = 15;
        int b = 10;
        /*MathFunctions.*/addToInt(a, b);
        System.out.println(a);

        /*
        MathFunctions.addToInt(a, b) is not the way to call that method.
        Even if it did work, it does not assign it back to a. It assigns it to x, which is out of the scope of the main
         */
    }
}
