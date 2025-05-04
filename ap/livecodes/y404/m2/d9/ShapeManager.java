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

//    public void add(Circle circle) {
//        shapes.add(circle);
//    }
//
//    public void add(Rectangle rectangle) {
//        shapes.add(rectangle);
//    }

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

    public int getShapeCount(ShapeType shapeType) {
        int counter = 0;

        for (int i = 0; i < this.shapes.size(); i++) {
            Shape shape = this.shapes.get(i);
            if (shapeType == ShapeType.CIRCLE) {
                if (shape instanceof Circle)
                    counter++;
            }
            else if (shapeType == ShapeType.RECTANGLE) {
                if (shape instanceof Rectangle)
                    counter++;
            }
            else if (shapeType == ShapeType.SHAPE) {
                if (shape instanceof Shape)
                    counter++;
            }
        }

        if (shapeType == ShapeType.CIRCLE) {
            for (int i = 0; i < this.shapes.size(); i++) {
                Shape shape = this.shapes.get(i);
                if (shape instanceof Circle)
                    counter++;
            }
        }
        else if (shapeType == ShapeType.RECTANGLE) {
            for (int i = 0; i < this.shapes.size(); i++) {
                Shape shape = this.shapes.get(i);
                if (shape instanceof Rectangle)
                    counter++;
            }
        }
        else if (shapeType == ShapeType.SHAPE) {
            for (int i = 0; i < this.shapes.size(); i++) {
                Shape shape = this.shapes.get(i);
                if (shape instanceof Shape)
                    counter++;
            }
        }

        switch (shapeType){
            case SHAPE:
                counter = (int)this.shapes.stream()
                        .filter(s -> s instanceof Shape)
                        .count();
                break;

            case CIRCLE:
                counter = (int)this.shapes.stream()
                        .filter(s -> s instanceof Circle)
                        .count();
                break;

            case RECTANGLE:
                counter = (int)this.shapes.stream()
                        .filter(s -> s instanceof Rectangle)
                        .count();
                break;
        }

        return counter;
    }
}
