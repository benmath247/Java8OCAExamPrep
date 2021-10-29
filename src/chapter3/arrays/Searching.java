package chapter3.arrays;

import java.util.Arrays;

public class Searching {
    public static void main(String[] args) {
        //arrays must be sorted to use binary search otherwise the result is not predictable
        int[] numbers = {1, 5, 7, 3, 2, 4}; //not sorted
        System.out.println(Arrays.binarySearch(numbers, 3)); //returns -2, which is nonsense
        Arrays.sort(numbers); //sorting...
        System.out.println(Arrays.toString(numbers)); //1, 2, 3, 4, 5, 7
        System.out.println(Arrays.binarySearch(numbers, 3)); //yields 2, which is index of 3.
        System.out.println(Arrays.binarySearch(numbers, 6)); // will yield -6 because to preserve order it would
                                                                    //be put at 5. (5*-1)-1 = -6

    }
}
