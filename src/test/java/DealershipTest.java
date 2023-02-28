import Cars.ElectricalCar;
import VehicleComponents.Battery;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Battery battery;
    ElectricalCar electricCar;
    Customer customer;


    @Before
    public void setUp() {
        battery = new Battery("E76", 8700, 1800);
        electricCar = new ElectricalCar("Volvo", "V70", 12000.00, "blue", battery);
        dealership = new Dealership("CodeClanCars", 673000.00);
        customer = new Customer("Barry Scott", 23000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("CodeClanCars", dealership.getName());
    }

    @Test
    public void canGetTill(){
        assertEquals(673000.00, dealership.getTill(), 0.01);
    }

    @Test
    public void canSetTill(){
        dealership.setTill(694000.00);
        assertEquals(694000.00, dealership.getTill(), 0.01);
    }

    @Test
    public void canAddItemToStock(){
        dealership.addItemToStock(electricCar);
        assertEquals(true, dealership.getStockList().contains(electricCar));
    }

    @Test
    public void canGetStockListWhenEmpty(){
        assertEquals(0, dealership.getStockListSize());
    }

    @Test
    public void canGetStockListSize(){
        dealership.addItemToStock(electricCar);
        assertEquals(1, dealership.getStockListSize());
    }

    @Test
    public void canRemoveItemFromStock(){
        dealership.addItemToStock(electricCar);
        dealership.removeItemFromStock(electricCar);
        assertEquals(0, dealership.getStockListSize());
    }

    @Test
    public void canCheckIfItemInStock(){
        dealership.addItemToStock(electricCar);
        assertEquals(true, dealership.checkItemInStock(electricCar));
    }

    @Test
    public void canSellItemToCustomer(){
        dealership.addItemToStock(electricCar);
        dealership.sellItemToCustomer(electricCar, customer);
        assertEquals(11000.00, customer.getWallet(), 0.01);
        assertEquals(true, customer.getCustomerItems().contains(electricCar));
        assertEquals(685000.00, dealership.getTill(), 0.01);
        assertEquals(false, dealership.checkItemInStock(electricCar));
    }


}
