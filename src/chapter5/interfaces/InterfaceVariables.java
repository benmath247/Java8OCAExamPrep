package chapter5.interfaces;

public
interface InterfaceVariables {
    /*
    Interface variables are assumed to be public, STATIC, and FINAL. Therefore the value must be set.
    Interface variables are essentially constant variables defined at the interface level
     */
    default void defaultMethod(){}

    /*
    Interface methods are a different story.
    1. A default method may only be declared in an interface
    2. Must use default keyword and provide implementation
    3. A default method is not assumed static, final, or abstract
    4. Like all methods in an interface, a default method is assumed to be public and will not compile private or
        protected
     */

    //public default void leanWitIt();              does not compile because no implementation
    //public int cantStopWontStop(){return 1;}      won't compile because no default keyword


    //IMPORTANT: if a class inherits two default values and tries to use one, it won't compile
}
