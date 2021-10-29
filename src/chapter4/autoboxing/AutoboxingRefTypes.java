package chapter4.autoboxing;

public class AutoboxingRefTypes {
    public void fly(String s) {
        System.out.println("String");
    }
    public void fly(Object obj){
        System.out.println("Object");
    }

    public static void main(String[] args){
        AutoboxingRefTypes abr = new AutoboxingRefTypes();
        abr.fly("a");
        abr.fly(100);// autoboxes to Integer object because it is the most specific method itll fit
    }
}
