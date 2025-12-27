package ap.lc08_19;

public class Counter {

    int value;

    public Counter(int value){
        this.value=value;
    }

    public void click(){
        value++;
    }

    public int getValue(){
        return value;
    }

    public void print(){
        System.out.println("value = "+this.value);
    }
}
