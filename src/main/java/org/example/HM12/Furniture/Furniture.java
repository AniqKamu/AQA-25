package org.example.HM12.Furniture;

public abstract class Furniture {
    private final String material;
    private final double weight;
    private final double price;

    public Furniture(String material, double weight, double price) {
        this.material = material;
        this.weight = weight;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public abstract void describe();
}
