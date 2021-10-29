package chapter5.inheritance;

public class HidingStaticMethods {
    /*hidden methods are when a child class defines a static method with the same name and signature as a static method
    defined in parent class. Overriding rules apply plus one more rule:
    5. The method defined in the child class must be marked as static if it is marked as static in the parent class.
        Must not be marked static if it is not marked static in parent.
     */
    public static void eat(){
        System.out.print("nomnomnom");
    }
}

class Extension extends HidingStaticMethods{
    public static void eat(){ //will not compile if not static
        System.out.print("omnomnomnomnom");
    }
}
