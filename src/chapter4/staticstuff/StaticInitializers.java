package chapter4.staticstuff;

//import static java.util.Arrays.asList;        //syntax for importing static stuff
//import static java.util.Arrays;               //wont compile because not static

public class StaticInitializers {
    {
        System.out.println("Instance block printed");
    }
    private static int one;
    private static final int two;
    private static final int three = 3;
    private static final int NUM;
    static {                //executed first, only once
        one = 1;
        two = 2;
    //    three = 3;    //does not compile
        NUM = 10;
        System.out.println("Static block");
    }
    {
        System.out.println("Instance block printed");
    }
    public static void main(String[] args){
        new StaticInitializers();
        new StaticInitializers();
    }
}
