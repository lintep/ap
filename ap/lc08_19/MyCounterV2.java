package ap.lc08_19;

public class MyCounterV2 {

    private Counter[] counters;
    public MyCounterV2(int count, int value){

        counters = new Counter[count];

        for (int i = 0; i < counters.length; i++) {
            counters[i]=new Counter(value);
        }
    }

    public void click(int id){
        if(id<counters.length)
            counters[id].click();

    }

    public void click(){
        for (Counter counter : counters) {
            counter.click();
        }
    }

    public void print(){
        for (int i = 0; i < counters.length; i++) {
            System.out.println("counter"+i+"= "+counters[i].getValue());
        }
    }

    public void randomClick() {
//        Random random =new Random();
//        int index = random.nextInt(0,counters.length);

        int index = (int) Math.random()*counters.length;

        click(index);
    }
}
