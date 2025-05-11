package ap.livecodes.y404.m2.d17;

public class Product implements PrintInfoInterface{
    protected int price;

    public Product(int price) {
        this.price = price;
    }

    @Override
    public void printInfo() {
        System.out.println("price="+price);
    }
}
