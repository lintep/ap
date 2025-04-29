package ap.livecodes.y404.m1.d26;

public class Circle extends Shape{
    private int r;
    private final double P = 3.14;

    public Circle(int r) {
//        super();
        System.out.println("create circle.");
//        for (int i = 0; i < 10; i++) {
//            System.out.println(r);
////            System.out.println(super.y);
//            System.out.println(y);
//        }
        this.r=r;
    }

    public Circle(int x, int y, int r) {
        super(x,y);
        System.out.println("Create circle.");
        this.r=r;
    }

    @Override
    public double getArea() {
//        return 3.14*r*r;
//        return P*r*r;
//        return Math.PI*r*r;
        return Math.PI*Math.pow(r,2);
    }

    public int getR() {
//        return r;
        return this.r;
    }
}
