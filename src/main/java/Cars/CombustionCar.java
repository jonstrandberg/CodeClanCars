package Cars;

import VehicleComponents.Engine;

public class CombustionCar extends Car {

    private VehicleComponents.Engine engine;

    public CombustionCar(String manufacturer, String model, double price, String colour, VehicleComponents.Engine engine) {
        super(manufacturer, model, price, colour);
        this.engine = engine;

    }

    public Engine getEngine() {
        return engine;
    }
}
