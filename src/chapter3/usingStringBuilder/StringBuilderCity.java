package chapter3.usingStringBuilder;

public class StringBuilderCity {

    public static void main(String[] args){
        StringBuilder sb1 = new StringBuilder(); //default capacity is 16
        StringBuilder sb2 = new StringBuilder("Lil Wayne rules");
        StringBuilder sb3 = new StringBuilder(5); //capacity of 5

        //three ways to construct a StringBuilder object

        sb3.append("Eminem"); //length 6
        System.out.println("sb3 capacity: "+sb3.capacity()+"\tsb3 size: "+sb3.length()); //returns 12, 6
        sb3.delete(0,1);
        System.out.println("sb3 capacity: "+sb3.capacity()+"\tsb3 size: "+sb3.length()); //maintains the same capacity
    }

    //remember StringBuilder and StringBuffer do the same things
}
