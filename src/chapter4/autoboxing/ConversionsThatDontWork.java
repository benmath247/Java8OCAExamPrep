package chapter4.autoboxing;

public class ConversionsThatDontWork {
    public static void play(Long l){
    }
    public static void play(Long... l){}

    public static void main(String[] args){
        //play(4);          will not convert int to long then Long
        play(4L);       //happily converts to Long from long

    }
}
