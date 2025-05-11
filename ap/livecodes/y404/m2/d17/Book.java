package ap.livecodes.y404.m2.d17;

public class Book {

    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void printInfo() {
        System.out.println(
                "name="+this.name+"\t" +
                        "price="+this.price);
    }
}
