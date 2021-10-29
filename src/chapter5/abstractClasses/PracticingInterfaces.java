package chapter5.abstractClasses;

import chapter5.interfaces.*;
//"Interfaces define contracts, which implementing classes must honor."
    //these contracts are unimplemented methods
    //all methods are public in an interface
    //they are by default: public and abstract
public interface PracticingInterfaces {
    void implementThis();
    final static int i = 0; //all variables are static final by default
}
class SayItAintSo extends PracticingAbstractClasses implements PracticingInterfaces{
    public void implementThis(){System.out.println("I will not go");}

    @Override
    void abstractMethod() {
        System.out.println("Turn the lights out.");
    }
    public static void main(String[] args){
        new SayItAintSo().implementThis();
        new SayItAintSo().abstractMethod();
        new PracticingAbstractClasses() { //cant use a normal method unless the abstract methods
            @Override                   //in the abstract class have been overridden
            void abstractMethod() {

            }
        }.normalMethod();
        new notAbstract().abstractMethod();

    }
}
