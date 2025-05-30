package ap.livecodes.y404.m2.d23;

import ap.livecodes.y403.m12.d19.Student;

import java.util.*;

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

        System.out.println("_________________");
        MyClass<String> myClassString = new MyClass<String>("salam");
        MyClass<Integer> myClassInteger = new MyClass<Integer>(123);
        System.out.println(myClassString);
        System.out.println(myClassInteger);
//        MyClass<Student> myClassStudent = new MyClass<Student>(new Student("q","b","c"));
//        System.out.println(myClassStudent);
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("ali","ahmadi","zanjan"));
        students.add(new Student("ali2","ahmadi","zanjan"));
        students.add(new Student("ali3","ahmadi","zanjan"));

        HashMap<Integer,Student> hashMap=new HashMap<>();
//        new Object().h
        for (Student student : students) {
            hashMap.put(student.getId(),student);
        }
        System.out.println(hashMap.size());
    }
}
