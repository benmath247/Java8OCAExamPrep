package chapter5.inheritance;

/*
RULES:
1. The first statement of every constructor is a call to another constructor within the class using this() or a call
using super()
2. The super() call may not be used after the first statement of the constructor
3. If no super() JAva will insert a no arg super() as the first statement
4. If parent doesnt have a no arg constructor and java puts one in, it will throw an error
5. If parent doesnt have a no arg constructor the compiler requires an explicit call to a parent constructor in each
child constructor
 */

class Animal {      /*does not have to extend from public class
                    one public class or interface per file
                        */
    private int age;
    private String name;
    public int getAge() {
        return age;
    }

    public Animal(int age){
        this.age = age;
    }

    public Animal(int age, String name){
        this(age);
        this.name = name;
    }


}

public class Lion extends Animal{
    private void roar(){
        System.out.println("The "+ getAge()+" year old lion says: ROAR!");
        /*private int age is not accessible from lion subclass even though the lions do have an age.
        It includes all properties but not all properties are directly accessible.

         */
    }
    public Lion(int age){ //if parent constructor has an argument, so does super constructor
        super(age);
    }

    public Lion(){ //no args constructor must define parameters of parent constructor. it is using the first constructor
        this(4);
    } //this or super can use any constructor with valid args

}

