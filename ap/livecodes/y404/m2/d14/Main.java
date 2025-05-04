package ap.livecodes.y404.m2.d14;

import ap.livecodes.Student;
import ap.livecodes.y404.m1.d26.Circle;
import ap.livecodes.y404.m1.d26.Shape;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        (new Object()).equals()
        System.out.println("ali"=="ali");//0 1 true false ali
        String x="ali";
        System.out.println(x=="ali");//0 1 true false ali
        System.out.println(x.equals("ali"));//0 1 true false ali
        System.out.println(x.compareTo("ali"));//0 1 true false ali
        System.out.println("daneshjoo"=="gol");

        Student student1 = new Student("ali","ahmadi","zanjan");
        Student student2 = new Student("ali","ahmadi","zanjan");
        System.out.println(student1==student2);
        System.out.println(student1.equals(student2));
        System.out.println(student1.compareTo(student2));

        Shape shape = new Shape();
        Shape shape2 = new Circle(3);
        Object o = shape2;
        System.out.println(o);
        System.out.println(o.toString());
//        shape.
        Object obj = new Object();

        Object obj2 = new Circle(4);
        Object obj3 = new Shape();
        Object obj4 = new ArrayList<>();


        ArrayList<Object> objects=new ArrayList<>();
        objects.add(shape);
        objects.add(shape2);
        objects.add(obj);
        objects.add(obj2);
        objects.add(obj3);
        objects.add(obj4);

        System.out.println("_______________");
        objects.add(new Student("ali","rezaee","zanjan"));
        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
