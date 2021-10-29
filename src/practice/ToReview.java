package practice;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ToReview {
    /*
    Review:
    - abstract class and interface access modifier rules
    - Runtime exception subclasses
    - ArrayLists and how they are printed
    - initialization of constructors
    - rules of access mods in inheritance
    - checked and unchecked exceptions and who throws, handles them
    - lambda syntax
     */
}
abstract class Pet{
    String name;
    int age;
    int var = 1;
    final String str;
    abstract void noise();  //abstract classes can have abstract methods
    void noise2(){}         //and implemented methods
    public Pet(String name, int age){
        this.name = name;
        this.age = age;
        noise();
        str = "1";
    }

}
interface eat{}

class Dog extends Pet{
    void noise(){
        System.out.println("WOOF!");
    }
    public Dog(String name, int age){
        super(name, age);
        super.var = age;

    }
}

class Cat extends Pet{
    void noise(){System.out.println("Meow");}
    public Cat(String name, int age){
        super(name, age);

    }
}

class Person implements canWalk{
    String name;
    Pet pet;
    public Person(String name){
        this.name=name;

    }
    void desc(){
        System.out.println(name + " has a pet named "+ pet.name + " who is "+ pet.age + " years old.");
    }
}
interface canWalk{
    default boolean canWalk(){return true;}
}
class Main{
    public static void main(String[] args){
        Person per1 = new Person("Ben");
        Dog wilson = new Dog("wilson", 22);
        per1.pet = wilson;
        per1.desc();
    }
}

