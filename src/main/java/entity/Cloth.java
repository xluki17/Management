package entity;

public class Cloth extends Product {
    private String size;
    private String material;

    public Cloth(int id, String productName, double weight, String color, int productCount, double price, String size, String material) {
        super(id, productName, weight, color, productCount, price);
        this.size=size;
        this.material=material;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }
}
