package chapter6;

import java.io.FileReader;
import java.io.IOException;

class AnimalsOutForWalk extends RuntimeException{ } //1.
class ExhibitClosed extends RuntimeException{} //2.
class ExhibitClosedForLunch extends ExhibitClosed{} //3.

/*
1 and 2 can be caught in any order because they both extend the same class.
3 must be caught before 2 or it will never be reached and cause a compilation error
 */
public class ExceptionInheritance {

    public static void main(String[] args){
        String reader = null;
        try {
            System.out.println(reader+1);
        }catch(NullPointerException e){
            try{
                if (reader != null) throw new IOException();
            } catch(IOException inner){
                throw new RuntimeException();
            }
        }
        finally {throw new NullPointerException();} //only the last exception thrown in code matters
    }

}
