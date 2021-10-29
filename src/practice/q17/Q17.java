package practice.q17;

import java.util.function.Predicate;

//Learn valid lambda syntax
public class Q17 {
    public static void main(String[] args){

        System.out.println(test(i -> i==5));
        //System.out.println(test(i -> {i==5;}));
        System.out.println(test((i) -> i==5));
       // System.out.println(test((int i) -> i==5));
       // System.out.println(test((int i) -> {return i == 5;}));
        System.out.println(test((i)-> {return i == 5;}));
    }
    private static boolean test(Predicate<Integer> p){
        return p.test(5);
    }
}
