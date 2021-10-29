package practice.q11;
//take time with loops and pay attention to breaks
public class q11 {
    public static void main(String[] args){
        int x = 5, j = 0;
        OUTER: for (int i = 0; i <3;)
            INNER: do {
            i++; x++; System.out.println("i: "+ i+"\t x: "+x);
            if (x > 10) break INNER;
            x+=4; System.out.println("x: "+x);
            j++; System.out.println("j: "+j);
            } while (j<=2);
            System.out.print(x);

    }
}
