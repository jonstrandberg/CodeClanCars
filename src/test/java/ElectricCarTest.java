import Cars.ElectricalCar;
import VehicleComponents.Battery;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricalCar electricCar;
    Battery battery;

    @Before
    public void setUp(){
        battery = new Battery("E76", 8700, 1800);
        electricCar = new ElectricalCar("Volvo", "V70", 12000.00, "blue", battery);
    }

    @Test
    public void canGetManufacturer() {
        assertEquals("Volvo", electricCar.getManufacturer());
    }

    @Test
    public void canGetBattery(){
        assertEquals(battery, electricCar.getBattery());
    }

}


