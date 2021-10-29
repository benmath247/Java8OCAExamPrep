package finalReviewBeforeTest.whileLoops;

public class WhileDWhileDWest {
    static int i = 0;
    static int j = 0;
    public static void main(String[] args) {
        while (i > 5){
            System.out.println("i: "+ i--);
        }
//        while(true){
//            System.out.println("infinite"); //infinite loop
//        }

        do{     //runs do once regardless of while then contionues if while is true
            System.out.println("do: "+ j--);
        }while(j>5);
    }
}
