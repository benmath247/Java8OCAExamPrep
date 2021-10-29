package finalReviewBeforeTest.meMeMeMethods;

public class MethodsMakeEm {
    void turnTheClubUpNow(){
        System.out.println("Everybody say ayyyyyyy");
    }
    /*
    Required elements:
    1. return type
    2. name
    3. parentheses
    4. body

    Optional:
    1. modifiers
    2. exception list

    A signature is the method's name and parameter types
    A method name should begin with a verb
     */
    int turnTheClubUp(String str){     //same name. different parameter list
        System.out.println("We are overloading this thing");
        return 1;       //compiler does not consider return type in overloaded methods
    }
}
