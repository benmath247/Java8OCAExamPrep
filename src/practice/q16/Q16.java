package practice.q16;

public class Q16 {
}

interface Animal{ public default String getName(){return null;}}
interface Mammal { public default String getName(){return null;}}
//abstract class Otter implements Mammal, Animal{public static void main(String[] args){}}


/*
Remember, an object cannot inherit two interfaces with the same method without overriding it
removing default and method implementation would also solve this problem
 */