package chapter4.contructors;

import java.util.ArrayList;

public class OrderOfInitialization {
    static void go(int num){System.out.println(num);}
    {go(0);}
    public OrderOfInitialization(int num){
        System.out.println(num);}
    {go(1);}
    static {
        go(2);
        new OrderOfInitialization(3); //pay attention to constructors in static blocks
        go(4);
    }
    {go(5);}
    //{new OrderOfInitialization(7);


    public static void main(String[] args) {
        ArrayList<String> order = new ArrayList<>();
        order.add("1. if there is a superclass, initialize it first");
        order. add("2. static variables declarations and static initializers in the order they appear");
        order.add("3. instance variables and initializers in order they appear");
        order.add("4. The constructor");

        new OrderOfInitialization(1);


    }
}
