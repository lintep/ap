package ap.livecodes.y404.m1.d24;

import ap.livecodes.y403.m12.d19.Student;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(3,7);

//        Scanner scanner = new Scanner(System.in);
//        int inputW=scanner.nextInt();
//        while (true)
//            try {
//                Rectangle r2=new Rectangle(inputW,7);
//                break;
//            } catch (Exception e) {
//                inputW=scanner.nextInt();
//            }
        System.out.println(r1.getArea());
        r2.printInfo();

        int totalPerimeters=0;
//        Rectangle[] rectangles=new Rectangle[2];
//        rectangles[0]=r1;
//        rectangles[1]=r2;
        Rectangle[] rectangles={r1,r2};
//        for (int i = 0; i < rectangles.length; i++) {
//            totalPrimeters+= rectangles[i].getPrimeter();
//        }
        for (Rectangle rectangle : rectangles) {
            totalPerimeters+= rectangle.getPerimeter();
        }
        System.out.println(totalPerimeters);

        ArrayList<Rectangle> list = new ArrayList<>();
        list.add(r1);
        list.add(r2);
        for (Rectangle rectangle : list) {
            totalPerimeters+= rectangle.getPerimeter();
        }

//        ArrayList<int>
//        ArrayList<Integer> integerArrayList=null;
        ArrayList<Integer> integerArrayList1=new ArrayList<>();
        integerArrayList1.add(12);
        integerArrayList1.add(14);

        ArrayList<Integer> integerArrayList2=new ArrayList<>();
        integerArrayList2.add(3);
        integerArrayList2.addAll(integerArrayList1);

        ArrayList<String> strings=new ArrayList<>();
        ArrayList<Student> students= new ArrayList<>();
    }
}
