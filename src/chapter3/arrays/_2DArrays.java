package chapter3.arrays;

import java.util.Arrays;

public class _2DArrays {
    public static void main(String[] args){
        //multiple array separators are all you need to declare 2d arrays

        int[][] a1;
        int[] a2[];
        int a3[][];
        int[] a4, a5[], a6[][]; //makes a 1d, 2d, and 3d

        //doesnt need to have all arrays the same size

        int[][] differentSizes = {{1}, {2,3}, {4, 5, 6}};
    }
}

class LoopingThrough2Ds{
    public static void main(String[] args){
        String[] dogs = {"Wilson", "Lance"};
        String[] cats = {"spike", "shaina"};
        String[][] pets = {dogs, cats};
        System.out.println(Arrays.toString(pets)); // doesnt work
        String[][] pets2 = {{"Wilson", "Lance"},{"spike", "shaina"}};
        System.out.println(Arrays.toString(pets2)); //doesnt work

        for (int i = 0 ; i < pets.length ; i++){
            for (int j = 0 ; j < pets[i].length ; j++){
                System.out.println(pets[i][j]);
            }
        }

        for (String[] i : pets){
            for (String j : i){
                System.out.println(j);
            }
        }


    }
}
