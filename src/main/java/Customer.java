import Interfaces.ISellable;
import abstractClasses.Vehicle;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<ISellable> customerItems;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        this.customerItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public ArrayList<ISellable> getCustomerItems() {
        return customerItems;
    }

    public void addItemToCustomer(ISellable item){
        this.customerItems.add(item);
    }

    public void buyItem(ISellable item) {
        wallet -= item.getPrice();
    }
}
