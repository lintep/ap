package ap.livecodes.y404.m2.d9;

import ap.livecodes.y404.m1.d26.Circle;
import ap.livecodes.y404.m1.d26.Rectangle;
import ap.livecodes.y404.m1.d26.Shape;

import java.util.ArrayList;

public class ShapeManager {

    private ArrayList<Shape> shapes;//=new ArrayList<>();
//    private int y = 100+ (int)Math.round(Math.PI);

    public ShapeManager(){
        shapes=new ArrayList<>();
    }

    public void add(Circle circle) {
        shapes.add(circle);
    }

    public void add(Rectangle rectangle) {
        shapes.add(rectangle);
    }

    public void add(Shape shape) {
        this.shapes.add(shape);
    }

    public double getTotalArea() {
        double totalArea = 0;
        for (Shape shape : this.shapes) {
            totalArea+=shape.getArea();
        }
        return totalArea;
    }

    public int getShapeCount() {
        return this.shapes.size();
    }
}
