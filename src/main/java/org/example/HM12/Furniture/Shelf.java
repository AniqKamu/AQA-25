package org.example.HM12.Furniture;

public class Shelf extends StorageFurniture{
    public Shelf(String material, double weight, double price, double capacity) {
        super(material, weight, price, capacity);
    }

    public void describe() {
        System.out.println("Chair made of " + getMaterial() + " weight is " + getWeight() + " capacity " + getCapacity() + " and have a price " + getPrice() + " $");
    }
}
