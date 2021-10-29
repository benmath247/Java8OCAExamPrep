package finalReviewBeforeTest.abstractstuff;

public abstract/*needs keyword abstract*/ class AbstractThis {
    abstract void abstractMethod(); //if a class has an abstract method it MUST be declared abstract
                                    //unimplemented
    void notAbstract(){System.out.println("not an abstract method");}
                                    //implemented
}

class ExtendThis extends AbstractThis{
    void abstractMethod(){System.out.println("we implemented it");} //subclasses need to implement parents' abstract methods
}

interface thisInterface{
    //void interfaceMethod(){}             //cant be done. it has to be declared default or be an abstract method *implicitly*
    public void interfaceMethod();                 //this is implicitly abstract public. cannot be static or final
    default void interfaceMethod2(){}       //legal because default is used
    public static final int i = 0;          //public static final are implied for all fields
                                    //ALL FIELDS IN AN INTERFACE ARE CONSTANT

}
//ABSTRACT CLASSES CAN IMPLEMENT INTERFACES WITHOUT DEFINING THEIR METHODS

/*
* Use abstract classes for:
* - sharing code amongst closely related classes
* - classes that extend it have common methods and fields
* - you want to declare non-static or non-final fields
*
* Use interfaces for:
* - You expect that unrelated classes would implement your interface (Comparable, Cloneable)
* - You want to specify the behavior of a particular data type, but you are not concerned about who implements behavior
* - Multiple inheritance
 */
