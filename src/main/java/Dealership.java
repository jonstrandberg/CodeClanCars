import Interfaces.ISellable;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private double till;
    private ArrayList<ISellable> stock;

    public Dealership(String name, double till) {
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<ISellable> getStockList() {
        return stock;
    }

    public void addItemToStock(ISellable stockItem){
        this.stock.add(stockItem);
    }

    public void removeItemFromStock(ISellable stockItem){
            if (checkItemInStock(stockItem)) {
                this.stock.remove(stockItem);
            }
    }

    public boolean checkItemInStock(ISellable stockItem){
        return this.stock.contains(stockItem);
    }

    public int getStockListSize(){
        return this.stock.size();
    }

    public void addSaleToTill(ISellable item){
        till += item.getPrice();
    }

    public void sellItemToCustomer(ISellable item, Customer customer){
        if (customer.getWallet() >= item.getPrice() && checkItemInStock(item)){
            removeItemFromStock(item);
            customer.addItemToCustomer(item);
            customer.buyItem(item);
            addSaleToTill(item);
        }
    }

}
