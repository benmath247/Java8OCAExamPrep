package finalReviewBeforeTest.usingObjects;

public class WeAreAllObjects {
}
class Quadrilateral{
    int side1 = 1;
    int side2 = 1;
    int side3 = 1;
    int side4 = 1;

    public Quadrilateral(){}

    public Quadrilateral(int side1, int side2, int side3, int side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }
}

class Rectangle extends Quadrilateral{
    int width = super.side1;
    int height = super.side3;

    int getArea(){
        return this.width * this.height;
    }
    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        super(width, width, height, height);
        this.width = width;
        this.height = height;
    }
}

class Square extends Rectangle{
    int side = super.width;

    public Square() {
    }

    public Square(int side){
        super(side, side);
        this.side = side;
    }

    public static void main(String[] args){
        int height = new Square().side; //must include no arg constructors all the way up the chain of inheritance
        System.out.println(height);
        Rectangle rec = new Square();
        System.out.println(rec.getArea());
        rec = null; //rec is eligible for garbage collection
    }
}