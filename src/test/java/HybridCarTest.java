import Cars.CombustionCar;
import Cars.HybridCar;
import VehicleComponents.Battery;
import VehicleComponents.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybrid;
    Engine engine;
    Battery battery;

    @Before
    public void setUp(){
        battery = new Battery("E76", 8700, 1800);
        engine = new VehicleComponents.Engine("Turbo Injection", 4000.00, 167);
        hybrid = new HybridCar("Volvo", "V70", 12000.00, "blue", engine,battery);
    }

    @Test
    public void canGetManufacturer(){
        assertEquals("Volvo", hybrid.getManufacturer());
    }

    @Test
    public void canGetEngine(){
        assertEquals(engine, hybrid.getEngine());
    }

    @Test
    public void canGetBattery(){
        assertEquals(battery, hybrid.getBattery());
    }

}
