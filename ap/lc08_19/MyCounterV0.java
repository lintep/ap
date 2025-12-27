package ap.lc08_19;

public class MyCounterV0 {

    private int counter0;
    private int counter1;
    private int counter2;
    private int counter3;

    public MyCounterV0(int value){
        counter0=100;
        counter1=100;
        counter2=100;
        counter3=100;
    }

    public void click(int id){
        if(id==0)
            counter0++;
        else if (id==1)
            counter1++;
        else if (id==2)
            counter2++;
        else if (id==3)
            counter2++;

    }

    public void click(){
        counter0++;
        counter1++;
        counter2++;
        counter3++;
    }

    public void print(){
        System.out.println("counter0= "+counter0);
        System.out.println("counter1= "+counter1);
        System.out.println("counter2= "+counter2);
        System.out.println("counter3= "+counter3);
    }

}
