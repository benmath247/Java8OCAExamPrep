package finalReviewBeforeTest.constructors;

public class Bicycle {
    int gear;
    int cadence;
    int speed;
    public Bicycle(int startCadence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    public Bicycle(){
        gear = 1;
        cadence = 10;
        speed = 0;
    }

    public static void main(String[] args){
        Bicycle myBike = /*"new" creates memory space for the obj*/ new Bicycle(30,0,8);
        Bicycle yourBike = new Bicycle();//uses the no arg constructor
    }
    /*
    * Java differentiates between constructors on the basis of # of args and their data types
    * You cannot write two constructors with the same # of args and the same data types
    *
    * You don't need to write a constructor. Java will create a no arg constructor if you don't. It calls the
    * no arg constructor of the super class. >>>>the compiler will complain if super has no no-arg constructor
    * If there is no superclass, superclass is Object.
    *
    * You can control which classes can instantiate a class with access modifiers*/
}
