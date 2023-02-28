package abstractClasses;

import Interfaces.ISellable;

public abstract class Vehicle implements ISellable {

    private String manufacturer;
    private String model;
    private double price;
    private String colour;

    public Vehicle(String manufacturer, String model, double price, String colour){
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.colour = colour;

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

}
