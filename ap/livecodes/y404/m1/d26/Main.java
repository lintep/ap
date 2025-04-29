package ap.livecodes.y404.m1.d26;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        main1(args);
//        main2(args);
        main3(args);
    }

    public static void main3(String[] args) {
        Random random =new Random();

        ArrayList<Shape> shapes= new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            shapes.add(new Rectangle(1,1,1+random.nextInt(100),1+ random.nextInt(100)));
        }


        for (int i = 0; i < 20; i++) {
            shapes.add(new Circle(random.nextInt(100)));
        }

        double totalArea=0;
        for (Shape shape : shapes) {
            totalArea+=shape.getArea();
        }
        System.out.println("totalArea: "+totalArea);

    }
    public static void main2(String[] args) {
        Random random =new Random();

        ArrayList<Rectangle> rectangles= new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            rectangles.add(new Rectangle(1,1,1+random.nextInt(100),1+ random.nextInt(100)));
        }

        ArrayList<Circle> circles= new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
//            circles.add(new Circle(random.nextInt(100)));
            Circle c = new Circle(1+random.nextInt(100));
            circles.add(c);
        }

        double totalArea=0;
        for (Rectangle rectangle : rectangles) {
            totalArea+=rectangle.getArea();
        }
        for (Circle circle : circles) {
            totalArea+=circle.getArea();
        }
        System.out.println("totalArea: "+totalArea);

        for (int i = 0; i < circles.size(); i++) {
            if(circles.get(i).getR()==0)
                System.out.println("i: "+ i + " is zero");
        }

    }

    public static void main1(String[] args) {
        Rectangle rectangle1=new Rectangle(1,1,10,12);
        Rectangle rectangle2=new Rectangle(1,1,2,3);
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
