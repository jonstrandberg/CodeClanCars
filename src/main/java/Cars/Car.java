package Cars;

import abstractClasses.Vehicle;

public abstract class Car extends Vehicle {


    public Car(String manufacturer, String model, double price, String colour) {
        super(manufacturer, model, price, colour);
    }
}
