package practice.q3;


    interface HasTail {
        int getTailLength();
    }

    abstract class Puma implements HasTail {
        /*protected*/ public int getTailLength() {  //cannot assign protected when it was public.
            return 4;
        }
        //review access mods for interfaces and abstract classes
    }

    class Cougar extends Puma {
        public static void main(String[] args) {
            //Puma puma = new Puma();     //puma is abstract so cannot be instantiated
            //System.out.println(puma.getTailLength());
        }
    public int getTailLength(int length) {return 2;}
    }
