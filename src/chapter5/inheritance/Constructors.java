package chapter5.inheritance;

class One{
    public One(){
        System.out.println("One");
    }
}
class Two extends One{
    public Two(){
        System.out.println("Two");
    }
}

public class Constructors extends Two{
    public static void main(String[] args){
        new Constructors();
    }
    /*
    all classes have constructors to construct objects. if one is not explicity stated, it has a default constructor.

    this() and super() constructors may only be used as the first statement in a constructor.

    Parent constructors are always called first when instantiating a child object. See example in main method
     */
}
