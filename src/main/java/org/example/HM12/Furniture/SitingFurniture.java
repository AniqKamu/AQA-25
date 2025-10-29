package org.example.HM12.Furniture;

public abstract class SitingFurniture extends Furniture{
    private final int seats;

    public SitingFurniture(String material, double weight, double price, int seats) {
        super(material, weight, price);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void sitDown() {
        System.out.println("You sit on furniture made of " + getMaterial());
    }
}
