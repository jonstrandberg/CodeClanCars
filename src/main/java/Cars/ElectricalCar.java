package Cars;

import VehicleComponents.Battery;

public class ElectricalCar extends Car {

    private Battery battery;

    public ElectricalCar(String manufacturer, String model, double price, String colour, Battery battery) {
        super(manufacturer, model, price, colour);
        this.battery = battery;
    }


    public Battery getBattery() {
        return battery;
    }


}
