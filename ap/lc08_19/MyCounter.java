package ap.lc08_19;

public class MyCounter {

    private Counter counter0;
    private Counter counter1;
    private Counter counter2;
    private Counter counter3;

    public MyCounter(int value){
        counter0=new Counter(value);
        counter1=new Counter(value);
        counter2=new Counter(value);
        counter3=new Counter(value);
    }

    public void click(int id){
        if(id==0)
            counter0.click();
        else if (id==1)
            counter1.click();
        else if (id==2)
            counter2.click();
        else if (id==3)
            counter2.click();

    }

    public void click(){
        counter0.click();
        counter1.click();
        counter2.click();
        counter3.click();
    }

    public void print(){
        System.out.println("counter0= "+counter0.getValue());
        System.out.println("counter1= "+counter1.getValue());
        System.out.println("counter2= "+counter2.getValue());
        System.out.println("counter3= "+counter3.getValue());
    }

}
