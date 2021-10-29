package chapter6;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class RuntimeExceptions {
    /*
    Runtime exceptions extend RuntimeException and do NOT need to be handled or declared
     */
    public static void main(String[] args){
        try{
            int a = 0;
            int b = 1;
            int c = b/a;
            System.out.println(c);
        } catch(ArithmeticException ae){
            System.out.println("This is an arithmetic exception");
        }

        try{
            int d = 1;
            int[] e = new int[0];
            System.out.println(e[d]);
        } catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println("This is an ArrayIndexOutOfBoundsException");
        }

        try{ //study this!
            Exception a = new Exception();
            ArrayIndexOutOfBoundsException b = (ArrayIndexOutOfBoundsException) a;
        } catch(ClassCastException cce){
            System.out.println("This is a class cast exception");
        }

        try{ //THROWN BY PROGRAMMER
            int a = 200;
            aMethod(a);
        }
        catch (IllegalArgumentException ill){
            System.out.println("This is an IllegalArgumentException");
        }

        try{ //review this
            String name = null;
            int a = name.length();
        } catch (NullPointerException npe){
            System.out.println("This is a NullPointerException");
        }

        try{
            String one = "one";
            Integer one1 = Integer.parseInt(one);
        } catch(NumberFormatException nfe){
            System.out.println("This is a NumberFormatException");
        }
    }
    public static void aMethod(int i){ //for illegal arg exception
        if (i > 100) throw new IllegalArgumentException();
        else System.out.println(i);
    }
}
