package chapter4.contructors;

import java.util.Scanner;

public class CreatingConstructors {

}

class Bunny{ //standard way to write constructor
    String color;
    int age;
    public Bunny(){System.out.print("We're making a bunny");}
    public Bunny(String color, int theAge){
        this(); //uses this object's no arg constructor if it is defined
        age = theAge; //dont need "this" because parameter name is different from field name
        this.color = color;
        System.out.println(". It is "+ age+" years old and the color "+color);

        System.out.println("who is his friend?");
        final String friend; //final variables can be declared in a constructor
        Scanner scanner = new Scanner(System.in);
        friend = scanner.nextLine();
        System.out.println("His friend is: "+friend);

    }

    public static void main(String[] args){
        Bunny bunny = new Bunny("white", 12);
    }
}