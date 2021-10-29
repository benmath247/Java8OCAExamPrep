package chapter4.autoboxing;

public class LetsAutobox {

    private static Integer one;
    private static final int two;
    static{
        two = 2;
        one = 1;
    }
    static void hi(int a){System.out.println("uses int");}
    //static void hi(Integer a){System.out.println("uses Integer");}

    public static void main(String[] args){
        hi(two);
        hi(one);


    }


}
