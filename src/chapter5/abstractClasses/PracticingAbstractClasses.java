package chapter5.abstractClasses;

abstract public class PracticingAbstractClasses {
    abstract void abstractMethod(); //if any methods are abstract then the whole
                                    // thing needs to be abstract
    void normalMethod(){System.out.println("carry me home");} //abstract classes can have normal methods too
}
class notAbstract extends PracticingAbstractClasses{
    void abstractMethod(){System.out.println("nanananananana");}

    public static void main(String... args){
        new notAbstract().abstractMethod();
        new notAbstract().normalMethod();
    }
}
