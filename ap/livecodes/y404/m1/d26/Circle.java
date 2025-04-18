package ap.livecodes.y404.m1.d26;

public class Circle extends Shape{
    private int r;
    private final double P = 3.14;

    public Circle(int r) {
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
