package chapter3.creatingAndManipulatingStrings;

public class ImmutabilityAndStringPool {
    static final boolean stringObjectsCanChange = false;



    public static void main(String[] args){
        String name = "Ben";
        String name1 = new String("Ben");

        System.out.println("name == name1: "+ (name==name1)); //interesting that () required for the String part to print
        System.out.println("name.equals(name1): "+ name.equals(name1));

        //these are different objects. name is in the String Pool because it is a literal.
        //name1 is less efficient and does not use the String Pool. It creates a new object

        //for a reference variable to have a different String attached it needs to be reassigned
        String a = "a";
        a += "b";
        a = a + "c";
        System.out.println(a);

    }
}
