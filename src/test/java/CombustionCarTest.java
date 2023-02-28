import Cars.Car;
import Cars.CombustionCar;
import com.sun.xml.internal.ws.api.pipe.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CombustionCarTest {

    CombustionCar car1;
    VehicleComponents.Engine engine;

    @Before
    public void setUp(){
        engine = new VehicleComponents.Engine("Turbo Injection", 4000.00, 167);
        car1 = new CombustionCar("Volvo", "V70", 12000.00, "blue", engine);
    }

    @Test
    public void canGetManufacturer(){
        assertEquals("Volvo", car1.getManufacturer());
    }

    @Test
    public void canGetModel(){
        assertEquals("V70", car1.getModel());
    }

    @Test
    public void canGetPrice(){
        assertEquals(12000.00, car1.getPrice(), 0.01);
    }

    @Test
    public void canSetPrice(){
        car1.setPrice(10000.00);
        assertEquals(10000.00, car1.getPrice(), 0.01);
    }


    @Test
    public void canGetColour(){
        assertEquals("blue", car1.getColour());
    }

    @Test
    public void canGetEngine(){
        assertEquals(engine, car1.getEngine());
    }



}
