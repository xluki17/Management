package entity;

public class Boots extends Product {
    private int size;
    private boolean isNaturalSkin;

    public Boots(int id, String productName, double weight, String color, int productCount, double price, int size, boolean isNaturalSkin) {
        super(id, productName, weight, color, productCount, price);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }

    public int getSize() {
        return size;
    }

    public boolean isNaturalSkin() {
        return isNaturalSkin;
    }
}
