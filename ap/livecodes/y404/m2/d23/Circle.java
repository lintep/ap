package ap.livecodes.y404.m2.d23;

public class Circle extends Shape{
    private double r;

    public Circle(int x, int y, double r) {
        super(x, y);
        this.r=r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public int compareTo(Shape o) {
        Circle inputCircle = (Circle) o;
        if(this.getArea()==inputCircle.getArea())
            return 0;
        else if(this.getArea()>inputCircle.getArea())
            return -1;
//        if(this.getArea()<inputCircle.getArea())
        else
            return +1;

    }
}
