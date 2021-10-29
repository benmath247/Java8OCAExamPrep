package finalReviewBeforeTest.forStatements;

public class OneForAll {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
        System.out.println();

        for (int i = 0; i < 10; ++i) { //does the same thing
            System.out.print(i);
        }

        //for(;;){System.out.print("infinite");} //creates infinite loop making
                                                    //making next code unreachable

        //enhanced for loops:

        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        for (int i : nums){
            System.out.println(i);
        }

    }
}

