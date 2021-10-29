package chapter5.inheritance;

class Fish{
    protected int size;
    private int age;

    public Fish(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

public class CallingInheritedMethods extends Fish {
    /*
    You can use public or protected members of the parent class including methods and primitive/objects
     */
    private int numberOfFins = 8;
    public CallingInheritedMethods(int age){
        super(age); //age is accessed via the super constructor but cannot be accessed directly
        this.size = 4; //size is protected so it can be accessed
    }
}
