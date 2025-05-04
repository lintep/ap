package ap.livecodes.y404.m2.d9;

import ap.livecodes.y404.m1.d26.Circle;
import ap.livecodes.y404.m1.d26.Rectangle;
import ap.livecodes.y404.m1.d26.Shape;

public class Main {

    public static void main(String[] args) {

        ShapeManager shapeManager = new ShapeManager();

        System.out.println(shapeManager);
        System.out.println(shapeManager.toString());

        Circle c=new Circle(2);
        System.out.println(c);
        Shape sh = c;
        shapeManager.add(sh);
//        shapeManager.add(new Circle(2));


        shapeManager.add(new Rectangle(2,4));
        shapeManager.add(new Rectangle(6,9));
        shapeManager.add(new Circle(9));
        shapeManager.add(new Shape());
        System.out.println(shapeManager.getTotalArea());
        System.out.println(shapeManager.getShapeCount());

        ShapeType shapeType = ShapeType.CIRCLE;
        System.out.println(shapeManager.getShapeCount(shapeType));

    }
}
