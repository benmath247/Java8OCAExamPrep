package chapter2.advancedControlFlow;

public class Continue {
    public static void main(String[] args){
        /*
        continue causes transfer of control flow to the boolean statement finishing the current loop.
        it is applied to the nearest inner loop

        labels work
         */



        OUTER: for (int i = 0;i<4; i++){
            System.out.print("i:"+i + " ");
            INNER: for (int j = 0;j<3; j++){
                System.out.print("j:"+j + "\t\t");
                if (j == 1) continue OUTER; //j doesnt print past 1
            }
        }
    }
}
