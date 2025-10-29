package org.example.HM12.Furniture;

public abstract class StorageFurniture extends Furniture {
    private final double capacity;

    public StorageFurniture(String material, double weight, double price, double capacity) {
        super(material, weight, price);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void openFurniture() {
        System.out.println("You open on furniture made of " + getMaterial());
    }
}
