package org.example.HM12.Furniture;

public class Main {
    public static void main(String[] args) {
        Furniture[] furniture = {
                new Chair("wood", 7.5, 80),
                new Sofa("fabrics", 35, 400, 3),
                new Wardrobe("chipboard", 60, 500, 40.5),
                new Shelf("wood", 1.5, 40, 7.5)
        };

        for (Furniture f : furniture) {
            f.describe();
        }
    }
}
