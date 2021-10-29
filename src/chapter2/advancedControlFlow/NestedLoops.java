package chapter2.advancedControlFlow;

public class NestedLoops {
    public static void main(String[] args) {
        int[][] myComplexArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        OUTER_LOOP: for (int[] mySimpleArray : myComplexArray) {
            INNER_LOOP: for (int i = 0; i < mySimpleArray.length; i++){ //you can have labels at the beginning. one word
                                                                        //followed by :
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }
    }
}
