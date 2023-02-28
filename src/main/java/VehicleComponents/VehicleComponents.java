package VehicleComponents;

import Interfaces.ISellable;

public abstract class VehicleComponents implements ISellable {

    private String name;
    private double price;

    public VehicleComponents(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
