package finalReviewBeforeTest.overriding;

public class OverrideOrDie {
    Object boo(int i) {
        Object obj = new Object();
        return obj;
    }
}

class Casper extends OverrideOrDie {
    @Override       //use so it will generate an error if you're messing up
    String boo(int i) {  //covariant return type since String is a subclass of Object
        return "boo";
    }

    //if this were static, OverrideOrDie.boo(int i) would be hidden
    /*
    * implications:
    * 1. the version of the overridden instance method that gets invoked is the one in the subclass
    * 2. The version of the static method that gets invoked depends on whether it is invoked from sub or super
     */
}

//overriding pays attention to return type as well as parameters and name

class ExampleA{
    static void staticstatic(){System.out.println("a");}
    //static void staticinstance(){}
    //void instancestatic(){}
    void instanceinstance(){System.out.println("getsoverridden");}
}

class ExampleB extends ExampleA{
    static void staticstatic(){System.out.println("b hides a");}
   //void staticinstance(){}    //compilation error
    //static void instancestatic(){}    //compilation error
   void instanceinstance(){System.out.println("overrides");}
}
class main{
    public static void main(String[] args){
        new ExampleA().staticstatic();
        new ExampleB().staticstatic();
        new ExampleA().instanceinstance();
        new ExampleB().instanceinstance();  //if ExampleB didnt have this method, it would take it from A
    }
}
