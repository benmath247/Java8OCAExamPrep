package chapter3.arrays;

public class OutOfBounds {
    public static void main(String[] args){
        int[] numbers = new int[9];

//           all of these throw index out of bounds exceptions because they are trying to access an index greater than
//           size of numbers
//        numbers[10] = 3;
//        numbers[numbers.length]= 3;
//        for (int i = 0; i <= numbers.length ; i++) numbers[i]=1;
    }
}
