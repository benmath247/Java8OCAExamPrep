package chapter2.operators;

import java.io.File;

public class EqualityOperators {
    /*
    "two objects are the same" vs. "two objects are equivalent"

    == and !=
    They are used in 3 scenarios:
    1. comparing two numeric primitive types. if they are different data types, the smaller is automatically promoted
    2. Comparing two boolean values
    3. Comparing two objects including null and Strings

    You can't mix and match so pay close attention for the exam
     */
    public static void main(String[] args){
        System.out.print("1. ");
        System.out.print(5==5.0);

        System.out.print("\n\n2. ");
        boolean y = false;
        boolean x = (y=true);
        System.out.print(x); //outputs true because y is assigned true

        /*
        == only returns true on objects if they point to the same object, not identical objects
         */

        File a = new File("myFile.txt");
        File b = new File("myFile.txt");
        File c = a;

        System.out.println(a == b); // false because they are two separate but identical files
        System.out.println(a==c); //true because reference c is assigned to the object at a
    }
}
