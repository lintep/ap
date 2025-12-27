package ap.lc08_19;

public class Main {

    public static void main(String[] args) {
        Counter counter=new Counter(100);

        MyCounter mc =  new MyCounter(100);
//        MyCounterV2 mc =  new MyCounterV2(5,100);
        mc.click(0);
        mc.click(0);
        mc.click(1);
        mc.click(2);
        mc.click(3);
        mc.click();
//        mc.randomClick();
        mc.print();
    }
}
