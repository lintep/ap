package ap.lc08_18;

import ap.lc08_11.Counter;

public class Point {

    private int x;
    private int y;
    private Counter counter;


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCounter(Counter counter) {
        this.counter = counter;
    }

    public void callCounter(){
        this.counter.click();
    }

    public void print(){
        System.out.println("x: "+x +"\ty: "+y);
    }
}
