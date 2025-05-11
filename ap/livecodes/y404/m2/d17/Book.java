package ap.livecodes.y404.m2.d17;

public class Book extends Product{

    private String name;

    public Book(String name, int price) {
        super(price);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void printInfo() {
        System.out.println(
                "name="+this.name+"\t" +
                        "price="+this.price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
