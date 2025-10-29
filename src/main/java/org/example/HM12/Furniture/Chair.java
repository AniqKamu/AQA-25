package org.example.HM12.Furniture;

public class Chair extends SitingFurniture{
    public Chair(String material, double weight, double price) {
        super(material, weight, price, 1);
    }

    @Override
    public void describe() {
        System.out.println("Chair made of " + getMaterial() + " weight is " + getWeight() + " and have a price " + getPrice() + " $");
    }
}
