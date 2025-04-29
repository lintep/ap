package ap.livecodes.y404.m1.d24;

public class Rectangle {

    private int w=0;
    private int l=0;

    public Rectangle(){
        w=0;
        l=0;
    }

    public Rectangle(int w, int l){// throws Exception {
//        if (w<0 || l<0)
//            throw new Exception("w<0 || l<0");
        this.w = w;
        this.l = l;
    }

    public int getArea() {
        return w*l;
    }

    public void printInfo() {
        System.out.println("(w:"+w+",l:"+l+")");
    }

    public int getPerimeter() {
        return 2*(w+l);
    }
}
