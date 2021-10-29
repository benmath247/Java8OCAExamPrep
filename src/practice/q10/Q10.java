package practice.q10;

public class Q10 {
}

class Grasshopper{
    public Grasshopper(String n){ n = name;
    }
    public static void main(String[] args) {
        Grasshopper one = new Grasshopper("g1");
        Grasshopper two = new Grasshopper("g2");
        one = two;
        two = null;
        one = null;
    }
    private String name;
}

/*
Which of the following are true?

a. Immediately after line 9, no grashopper objects are eligible for garbage collection
b. Immediately after line 10, no grashopper objects are eligible for garbage collection
c. Immediately after line 9, only one grashopper object are eligible for garbage collection
d. Immediately after line 10, only one grashopper object are eligible for garbage collection
e. Immediately after line 11, only one grashopper object are eligible for garbage collection
f. the code compiles
g. the code doesn't compile
 */