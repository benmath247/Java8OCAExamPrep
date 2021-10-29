package chapter3.arrays;

public class ArraysWithReferenceVariables {
    public static void main(String[] args){
        String[] names= new String[2]; //points to null

        String[] strings = {"hello"};
        Object[] objects = strings; //no cast required because strings is a smaller data type than objects
        String[] strings2 = (String[]) objects; //cast required because objects is a bigger data type than strings
        //String[] strings3 = new StringBuilder[0]; //does not compile
        objects[0] = new StringBuilder(); //will throw an exception at runtime but will compile fine. it is an object
                                            //but not a string  ////STUDY THIS
    }
}
