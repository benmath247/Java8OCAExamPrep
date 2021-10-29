package chapter2.advancedControlFlow;

public class Break {
       /*
       breaks allow us to break out of a higher level loop
       breaks can have optional labels as follows:

       break optionalLabel;

       these labels correspond to labeled loops and will break the one that it is labeled
        */

    public static void main(String[] args){
           PARENTLOOP: for (int i = 0; i < 10 ; i++){
                            System.out.println("i: "+i);
                            for (int j = 0; j < 10; j++){
                                   System.out.println("j: "+j);
                                   break PARENTLOOP;
                            }
           }
           System.out.println("---------------");

           PARENTLOOP: for (int i = 0; i < 10 ; i++){
                  System.out.println("i: "+i);
                  for (int j = 0; j < 10; j++){
                         System.out.println("j: "+j);
                         break;
                  }
           }

           System.out.println("---------------");

           PARENTLOOP: for (int i = 0; i < 10 ; i++){
                  System.out.println("i: "+i);
                  for (int j = 0; j < 10; j++){
                         System.out.println("j: "+j);

                  }
           }
    }
}
