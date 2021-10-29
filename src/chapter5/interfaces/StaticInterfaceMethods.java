package chapter5.interfaces;

public interface StaticInterfaceMethods {
    /*
    static interface methods are assumed public and will not compile if marked otherwise
    to reference a static interface method, a reference to interface must be used even though the interface is
    implemented

    STATIC METHODS ARE NOT INHERITED BY SUBCLASSES
     */
    static String whatsMyName(){
        return "Ben";
    }
}

class Jaberwalkee implements StaticInterfaceMethods{
    public static void main(String[] args){
        //whatsMyName(); wont compile because it is static with no reference to interface
        System.out.println(StaticInterfaceMethods.whatsMyName());
    }
}
