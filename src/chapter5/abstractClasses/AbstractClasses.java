package chapter5.abstractClasses;

public abstract class AbstractClasses {
    /*
    Abstract classes cannot be instantiated.
    Abstract methods do not need to be defined. Otherwise methods in abstract classes must be defined.
    Abstract methods can only be defined in abstract classes
     */

    public abstract void hollerForADollar();    //ends with ; not implementation
        //public abstract void makeItRain(){}   //wont compile because {}} implements method. abstract methods can't
                                                // include implementation

    //abstract methods cannot be final or private
    //private abstract turnUp();
    //public abstract final jump();
}

/*class CoolKid extends AbstractClasses{
    private void hollerForADollar(){}
}  ////does not compile because method is not overridden because of access modifier being more restricted
*/

