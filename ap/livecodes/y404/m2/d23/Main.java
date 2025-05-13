package ap.livecodes.y404.m2.d23;

import ap.livecodes.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            shapes.add(new Circle(0,0, random.nextDouble(100)));
        }

        for (Shape shape : shapes) {
            shape.printInfo();
        }

        System.out.println("___________");

//        int[] array = {4,2,6};
//        Object[] array = shapes.toArray();
        Shape[] array = shapes.toArray(new Shape[shapes.size()]);
        Arrays.sort(array);
        for (Shape sh : array) {
            sh.printInfo();
        }

    }
}
