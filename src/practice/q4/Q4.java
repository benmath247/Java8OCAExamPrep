package practice.q4;
//REVIEW THIS
public class Q4 {
    public static void main(String[] args){
        boolean keepGoing = true;
        int count = 0;
        int x = 3;
        while(count++ < 3){                             //count is used
            System.out.println("count: "+(count-1));    //incremented count is used
            int y = (1 + 2 * count) % 3;
            System.out.println("Y: "+y);  //test
            switch(y){
                default:
                case 0: x -= 1; break;
                case 1: x+=5;
            }
            System.out.println("x: "+x);
        }
        System.out.print(x);
    }
}
