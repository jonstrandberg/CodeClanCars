package Cars;

import VehicleComponents.Battery;
import VehicleComponents.Engine;

public class HybridCar extends Car {

    private VehicleComponents.Engine engine;
    private Battery battery;

    public HybridCar(String manufacturer, String model, double price, String colour, VehicleComponents.Engine engine, Battery battery) {
        super(manufacturer, model, price, colour);
        this.engine = engine;
        this.battery = battery;

    }

    public Engine getEngine() {
        return engine;
    }

    public Battery getBattery() {
        return battery;
    }
}
