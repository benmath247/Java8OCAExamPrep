package practice.q12;


//what is the string output?
public class Q12 {
    private String color;
    public Q12(){
        this("white");
    }
    public Q12(String color){
        color = color;
    }

    public static void main(String[] args){
        Q12 q = new Q12();
        System.out.println("color:"+q.color);
    }
}
