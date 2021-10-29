package chapter5.polymorphism;

public class Polymorphism {
    public static void main(String[] args){
        Person ben = new Student();  //person is implementing Boy so Ben can be passed to Boy interface reference object
        Student Jennifer = new GradStudent();
        Boy boy = ben; //boy, Ben, and person are all the same object with different references
        Person person = ben;
        //Girl girl = Jennifer; does not compile because Student does not implement Girl even though Gradstudent
        //                      implements Girl
        //Jennifer.hasHigherEducation();    //won't compile even though Jennifer is a grad student because she
                                            //doesnt have access because she is saved in memory as a student

    }
}

/*
1. The type of object determines which properties exist within the object in memory
2. The type of reference to the object determines which methods and variables are accessible
 */

abstract class Person implements Boy{
    boolean hasHair(){return true;}
}

class Student extends Person{ //cannot implement girl because boy has a default method already for bathroom
    boolean likesToStudy(){return true;}
}

class GradStudent extends Student implements Girl{ //cannot implement boy and girl because two default methods
    boolean hasHigherEducation(){return true;}
}

class PhD extends Student {//implements Girl{
    boolean doesResearch(){return true;}
}

class BusDriver extends Person{}

interface Boy{
    default String bathroomChoice() {return "Boys";}
}

interface Girl{
    default String looksPretty() {return "Heck yeah";}
}
