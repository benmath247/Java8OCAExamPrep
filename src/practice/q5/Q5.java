package practice.q5;
//find output   - abcde
public class Q5 {
    public static void main(String[] args){
        System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
        } catch (RuntimeException e){           //this runs because IllegalArgumentException is a Runtime Exception
            System.out.print("c");
        } finally {
            System.out.print("d");
        }
        System.out.print("e");
    }

}
