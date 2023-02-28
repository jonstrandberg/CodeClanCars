package VehicleComponents;

public class Battery extends VehicleComponents{

    private int power;

    public Battery(String name, double price, int power) {
        super(name, price);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

}
