package chapter3.Equality;

public class Equality {
    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = sb1.append("1");
        System.out.println(sb1 == sb2); //false
        System.out.println(sb1 == sb3); //pointing to the same object  //true

        String x = "Hello";
        String y = "Hello";
        System.out.println(x==y); //true because String pool

        String a = new String("Hello");
        String b = new String("Hello");
        System.out.println(a==b); //false
        System.out.println(a.equals(b)); //true

        x += " ";
        System.out.println(x.trim()==y); //== is evaluated at compile time and trim is executed at runtime

    }
}
