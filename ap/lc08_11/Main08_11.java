package ap.lc08_11;

public class Main08_11 {
    public static void main(String[] args) {

        System.out.println("hi");

        int x=10;
        Counter counter1 = new Counter("counter1",-19999);
        Counter counter2 = new Counter("counter2",190);

        System.out.println(counter1.getValue());
        counter1.click();

        for (int i = 0; i < 1000; i++) {
            counter1.click();
            System.out.println(i + "\t" + counter1.getValue());
        }

        int value1 = counter1.getValue();
        System.out.println("value1: " + value1);

        System.out.println("value2: " + counter2.getValue());

        Counter counter3 = new Counter("c3",0);
        Counter counter4 = new Counter("c4",0);
        for (int i = 0; i < 200; i++) {
            if(Math.random()>0.5)
                counter3.click();
            else
                counter4.click();
            counter3.print();
            counter4.print();
            System.out.println("___________");
        }

//        counter1.set(-2334);
        counter1.print();
    }
}
