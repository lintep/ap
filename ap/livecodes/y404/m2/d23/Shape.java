package ap.livecodes.y404.m2.d23;

public abstract class Shape implements Comparable<Shape>{

    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getArea();

    public final void printInfo(){
        System.out.println(this+"\t area: "+getArea());
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
