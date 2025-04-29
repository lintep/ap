package ap.livecodes.y404.m1.d26;

public class Rectangle extends Shape{

    private int w=0;
    private int l=0;

    public Rectangle(int w, int l){
        this(0,0, w, l);
    }

    public Rectangle(int x, int y, int w, int l){
        super(x,y);// throws Exception {
//        if (w<0 || l<0)
//            throw new Exception("w<0 || l<0");
        this.w = w;
        this.l = l;
    }

    @Override
    public double getArea() {
        System.out.println(super.getArea());
        return w*l;
    }

}
