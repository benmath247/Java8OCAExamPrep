package practice.q7;

import java.util.ArrayList;
import java.util.List;

//find output
public class Q7 {
    public static void main(String[] args){
        int[] array = {6,9,8};
        List<Integer> list = new ArrayList<>();
        list.add(array[0]);     //list is 6
        list.add(array[2]);     //list is 6,8
        list.set(1, array[1]);  //list is 6,9
        list.remove(0);   // list is 9
        System.out.println(list);   //prints [9]
    }
}
