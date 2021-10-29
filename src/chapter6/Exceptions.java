package chapter6;

public class Exceptions {
    void fall() throws Exception {
        throw new Exception();
    }
    public static void main(String[] args) throws Exception {
    /*
    Checked exceptions include Exception and all subclasses that do not extend RuntimeException

     Unchecked exceptions are RuntimeExceptions

     **handle or declare rule**
     You have to handle or declare checked exceptions


     */


    /*
    two kinds of exceptions on exam:

    1. code that is wrong:
     */
        String[] animals = new String[0];
        System.out.println(animals[0]); //ArrayIndexOutOfBounds

        /*
        2. code result in an exception by explicitly requesting Java throw one:

        throw new Exception();
        throw new Exception("Ow! I fell!");
        throw new RuntimeException();
        throw new RuntimeException("OW!");
         */



    }
}
