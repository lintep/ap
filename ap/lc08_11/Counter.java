package ap.lc08_11;

public class Counter {

    private int value;
    private String name;

    public Counter(String name, int initialValue){
        this.name = name;

//        if(initialValue>99)
//            value=initialValue%100;
//        else if (initialValue<0) {
//            value=0;
//        } else
//            value=initialValue;
        this.set(initialValue);
    }

    public void click(){

        value = value + 1;

        if(value==100)
            value = 0;
    }
    public int getValue(){
        return value;
    }

    public void print(){
        System.out.println(name + ":\t" + this.value);
    }

    public void set(String name, int value){
        this.name=name;
//        this.value=value;
        set(value);
    }

    public void set(String name){
        this.name=name;
    }

    private void set(int value){
//        this.value=value;
        if(value>99)
            this.value=value%100;
        else if (value<0) {
            this.value=0;
        } else
            this.value=value;
    }

    public void set(){
//        this.name="NotSet";
//        this.value=0;
        this.set("NoSet",0);
    }


}
