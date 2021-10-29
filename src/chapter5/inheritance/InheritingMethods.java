package chapter5.inheritance;

public class InheritingMethods {
    /*
    Overriding methods have the same signature and return type as another method in the parent class.
    To Override:
    1. Method in child class must have same signature as parent
    2. The method in the child class must be at least as accessible or more accessible than the parent
    3. May not throw a checked exception that is new or broader than the class of any exception thrown in parent method
    4. If method returns a value, it must be the same or a subclass of the method in the parent class. This is called
    Covariant Return Types


    Redeclaring private methods:
    you can redefine a method in a child class that is private in a parent class, but technically it is not overriding.
    Rules 1-5 are not enforced by compiler
     */

    private String getNumber() {
        return "number";
    }
}

class Example extends InheritingMethods{
    public int getNumber(){
        return 2; // allowed because InheritingMethods.getNumber() is private
    }
}
