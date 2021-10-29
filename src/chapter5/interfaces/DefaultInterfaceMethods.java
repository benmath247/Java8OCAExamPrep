package chapter5.interfaces;

public interface DefaultInterfaceMethods {
    //default methods are abstract methods with default implementation
    boolean YesNo();
    //public double LetsGetIt(){ doesnt compile because it thinks it is abstract but is also implemented
    public default double LetsGetIt(){ //public is not needed because it is assumed.
        return 20.0;
    }
}
