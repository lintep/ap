package ap.livecodes.y404.m2.d17;

public class Pen extends Product{
    private String brand;
    private String color;

    public Pen(String brand, String color, int price) {
        super(price);
        this.brand = brand;
        this.color = color;
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
                ", price=" + super.price +
                '}';
    }
}