package org.example.HM12.Furniture;

public class Sofa extends SitingFurniture{
    public Sofa(String material, double weight, double price, int seats) {
        super(material, weight, price, seats);
    }

    @Override
    public void describe() {
        System.out.println("Sofa made of " + getMaterial() + " weight is " + getWeight() + " have a seats " + getSeats() + " and have a price " + getPrice() + " $");
    }
}
