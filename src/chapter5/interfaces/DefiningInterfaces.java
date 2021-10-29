package chapter5.interfaces;

public interface DefiningInterfaces {
    /*
    1. Interfaces cannot be instantiated directly. They must be implemented by a class
    2. An interface is not required to have any methods
    3. Interfaces cannot be marked as final
    4. All top-level interfaces are assumed public or default access and must include the abstract modifier in definition
    5. All nondefault methods in an interface are assumed to have abstract and public in their definitions
     */
    public int eatPlants();
}

interface Defining{
    public String eatPlants();
}

interface Defining2{
    public int eatPlants()
;}

//class Yalla implements DefiningInterfaces, Defining{}
// does not compile because same method but different return type
class ThisWorks implements DefiningInterfaces, Defining2{
    public int eatPlants(){return 0;}
} //this works even though it inherits the method twice because they are the same and it is being implemented