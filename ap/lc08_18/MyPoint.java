package ap.lc08_18;

import ap.lc08_11.Counter;

public class MyPoint {


    private int x;
    private int y;

    private Counter counter;

    public MyPoint(){
        x=1;
        y=1;
        counter=new Counter("c1",0);
    }

    public MyPoint(String counterName, int initialValue){
        x=1;
        y=1;
        counter=new Counter(counterName,initialValue);
    }

    public MyPoint(Counter counter){
        x=1;
        y=1;
        this.counter=counter;
    }

    public MyPoint(int x){
        this.x=x;
        y=1;
    }


    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void callCounter(){
        this.counter.click();
    }

    public void print(){
        System.out.println("x: "+x +"\ty: "+y);
    }

}
