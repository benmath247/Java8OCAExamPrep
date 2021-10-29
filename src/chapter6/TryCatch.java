package chapter6;


public class TryCatch {

    static int[] animals = new int[1];

    public static void main(String[] args) throws Exception {

        try {
            System.out.println("Billy Jean is not my lover.");
            fall(); //throws ArrayIndexOutOfBoundsException
            System.out.println("never get here");
        } catch (ArrayIndexOutOfBoundsException jennifer) { //when an ArrayIndexOutOfBoundsException is thrown in try, this executes
            System.out.println("She's just a girl who claims that I am the one");
        } finally { //runs no matter what (UNLESS System.exit() is present in try or catch)
            System.out.println("but the kid is not my son");
        }
    }

    private static void fall() {
        throw new ArrayIndexOutOfBoundsException();
    }
}
