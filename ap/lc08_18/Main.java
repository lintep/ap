package ap.lc08_18;

import ap.lc08_11.Counter;

public class Main {

    public static void main(String[] args) {
        Point point = new Point();
//        point.callCounter();

        MyPoint myPoint = new MyPoint();
        myPoint.callCounter();

        new MyPoint(new Counter("temp",100)).callCounter();
        new MyPoint("temp",100).callCounter();

//      1  Point point;
//      2  pTemp=new Point();
//      3  point=pTemp;



        Point[] points = new Point[3];
        int[] ints = new int[3];

        points[0]=point;
        points[1]=new Point();
//        points[2]=4;


//        if(Math.random()>0.5) {
//            Point p2;
//            points[3]=p2;
//        }

        point.print();
        points[0].print();
        points[1].print();
        points[2]=point;
        points[2].print();

        f1();
        new Point().print();

    }

    public static void f1(){
        Point point1=new Point();
        Point point2=new Point();
        Point point3=new Point();
        point2.print();
    }
}
