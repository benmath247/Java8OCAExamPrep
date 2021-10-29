package chapter5.polymorphism;
//I HAVE TO STUDY THIS!
public class Casting {
    public static void main(String[] args) throws Exception{
        Lab wilson = new Lab();
        wilson.noise();
        //Lab wilson2 = wilson;     //won't compile because Dog is a parent class of Lab so it needs to be exp cast
        Dog wilson2 = wilson;
        Lab wilson3 = (Lab)wilson2; //casting to superclass is okay
        wilson2.noise();
        wilson3.noise();
    }
}
/*
You can reclaim the variables and methods that your reference object lost by casting!

Rules:
1.  Casting an object from a subclass to a superclass doesn't require explicit casting
2.  Casting an object from a superclass to a subclass requires an explicit cast
3.  The compiler will not allow casts to unrelated types
4.  Even when the code compiles without issue, an exception may be thrown at runtime if the object being cast is not
    actually an instance of that class
 */

class Pet{
    void noise(){System.out.println("just a pet");}
}

class Dog extends Pet{
    void noise(){System.out.println("woof!");}
}

class Lab extends Dog{
    void noise(){System.out.println("WOOOOOF!!!! WOOOOOF!!!");}
}