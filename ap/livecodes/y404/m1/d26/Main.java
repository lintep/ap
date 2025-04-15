package ap.livecodes.y404.m1.d26;

import ap.livecodes.y404m1d24.Rectangle;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(10,12);
        Rectangle rectangle2=new Rectangle(2,3);
        Circle circle1 = new Circle(4);
        Circle circle2 = new Circle(5);

        double totalArea=0;
        totalArea+=rectangle1.getArea();
        totalArea+=rectangle2.getArea();
        totalArea+=circle1.getArea();
        totalArea+=circle2.getArea();
        System.out.println("totalArea: "+totalArea);
    }
}
