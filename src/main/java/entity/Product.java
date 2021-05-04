package entity;

public class Product {
    private int id;
    private String productName;
    private double weight;
    private String color;
    private int productCount;
    private double price;

    public Product(int id, String productName, double weight, String color, int productCount, double price) {
        this.id = id;
        this.productName = productName;
        this.weight = weight;
        this.color = color;
        this.productCount = productCount;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getProductCount() {
        return productCount;
    }
}
