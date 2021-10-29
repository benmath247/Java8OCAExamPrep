package chapter5.inheritance;

public class OverridingVsHiding {
    int x = 0;
    public static boolean truefalse() {     ///adding static makes aMethod() only know this definition of truefalse().
        return false;
    }
    public void aMethod() {
        System.out.println("response is: "+ truefalse() + " " + x);
    }
}
class LetsSee extends OverridingVsHiding{
    int x = 1; //hides other x variable
    public static boolean truefalse(){      //hidden from aMethod() because truefalse is static
        return true;
    }
    public void anotherMethod() {
        System.out.println("response is: "+ truefalse() + " " + x);
    }

    public static void main(String[] args){
        LetsSee Ben = new LetsSee();
        Ben.aMethod();
        Ben.anotherMethod();
    }
}
