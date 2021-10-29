package chapter3.arrays;

import java.util.Arrays; //need these to sort

public class Sorting {
    public static void main(String[] args) {
        int numbers[] = {2, 100, 72, 50, 2, 40};
        Arrays.sort(numbers);  //returns void
        System.out.println(Arrays.toString(numbers)); //need Arrays.toString to actually print arrays


        String[] strings = {"10", "100", "1000", "9", "90"};
        Arrays.sort(strings); //orders strings based on the first number in the string, not the actual value. 100<9
        System.out.println(Arrays.toString(strings));
    }
}
