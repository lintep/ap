package ap.livecodes.y404.m1.d26;

public class Shape {

    private int x;
    protected int y;

    public Shape(){
        this(0,0);
    }

    public Shape(int x, int y){
        System.out.println("create shape.");
        this.x=x;
        this.y=y;
    }

    public double getArea(){
        return 0;
    }
}
