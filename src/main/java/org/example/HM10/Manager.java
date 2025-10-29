package org.example.HM10;

public class Manager extends Worker{
    private int getNumberOfSubordinates;

    public Manager(double baseSalary, String name, int getNumberOfSubordinates) {
        super(baseSalary, name);
        this.getNumberOfSubordinates = getNumberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return getNumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int getNumberOfSubordinates) {
        this.getNumberOfSubordinates = getNumberOfSubordinates;
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates > 0) {
            return getBaseSalary() * (1 + (getNumberOfSubordinates / 100.0 * 3));
        } else {
            return getBaseSalary();
        }
    }
}
