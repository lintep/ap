package ap.livecodes.y404.m2.d17;

public class Pen {
    private String brand;
    private String color;
    private int price;

    public Pen(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void printInfo() {
        System.out.println(
                "brand="+getBrand()+"\t" +
                        "color="+getColor()+"\t" +
                        "price="+getPrice());
    }

    @Override
    public String toString() {
        return "Pen{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}