package practice.q2;

public class q2 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder(); //watch out for s1 vs sb1
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);       //true
        System.out.println(s1.equals(s2));      //true
        System.out.println(sb1.toString() == s1); //false - different objects. sb1 is not in the String pool
        System.out.println(sb1.toString().equals(s1));  //true
    }
}
