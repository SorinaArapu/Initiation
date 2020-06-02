public class Laptop {

    int price;
    double size;
    private String brand;

    public Laptop(int price, int size, String brand) {
        this.price = price;
        this.size = size;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
}