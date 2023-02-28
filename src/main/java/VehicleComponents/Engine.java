package VehicleComponents;

public class Engine extends VehicleComponents{

    private int horsePower;

    public Engine(String name, double price, int horsePower) {
        super(name, price);
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
