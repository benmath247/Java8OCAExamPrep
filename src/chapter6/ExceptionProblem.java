package chapter6;

public class ExceptionProblem {
    public static void main(String[] args){
        String result = "";
        String v = null;
        try{
            try{
                result += "before";
                v.length(); //throws null pointer exception... onto catch block
                result += "after"; //never reached because of exception
            } catch (NullPointerException e){
                result += "catch";
                throw new RuntimeException(); //onto finally, then catch block for outer try
            } finally {
                result += "finally";
                throw new Exception();
            }
        } catch (Exception e) {
            result += "done";
        }
        System.out.println(result);
    }
}
