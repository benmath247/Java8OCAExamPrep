package practice.q15;

import java.util.ArrayList;
import java.util.List;

public class Q15 {
}

interface CanSwim{}
class Amphibian implements CanSwim{}
class Tadpole extends Amphibian{}
class FindAllTadPole{
    public static void main(String[] args){
        List<Tadpole> tadpoles = new ArrayList<Tadpole>();
        for (/*have to look at the reference identifier*/Amphibian amphibian : tadpoles){
   //         ____ tadpole = amphibian;
        }
    }
}
/*
Which could fill in the blank and allow the class to successfully compile?
a. CanSwim      //Yes, amphibian implements canswim
B. Long         //no, amphibian is not a long
C. Amphibian    //Yes, amphibian is an amphibian
D. Tadpole      //no amphibian is not a tadpole
E. Object       //Yes, amphibian is an object
 */
