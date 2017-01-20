import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 1/20/17.
 */
public class CarRadiatorTest {
    @Test
    public void createCarRadiator_takesSixProperties() {
        CarRadiator myRadiator = new CarRadiator("Mopar", 12345, "a cool radiator", 250, 0.0f, 0.0f);
        assertEquals(myRadiator.manufacturer, "Mopar");
        assertEquals(myRadiator.partNumber, 12345);
        assertEquals(myRadiator.description, "a cool radiator");
        assertEquals(myRadiator.coolantPressure, 250, 0.0002);
        assertEquals(myRadiator.price, 0.0f, 0.00);
        assertEquals(myRadiator.subTotal, 0.0f, 0.00);
    }

    @Test
    public void fullDescription_returnsAStringContainingAllAttributes() {
        CarRadiator myRadiator = new CarRadiator("Audi", 12345, "Sick radiator, brah", 250, 0.0f, 0.0f);
        String stringDescription = "manufacturer: Audi, partNumber: 12345, description: Sick radiator, brah, coolantPressure: 250.0 Pa";
        assertEquals(myRadiator.fullDescription(), stringDescription);
    }

    @Test
    public void coolingSystemComponent_returnsTrueIfComponentIsACoolingSystemComponent(){
        CarRadiator myRadiator = new CarRadiator("Audi", 12345, "Sick radiator, brah", 250, 0.0f, 0.0f);
        assertTrue(myRadiator.coolingSystemComponent());
    }

    @Test
    public void engineComponent_returnsTrueIfPartIsEngineComponent() {
        CarRadiator myRadiator = new CarRadiator("Audi", 12345, "Sick radiator, brah", 250, 0.0f, 0.0f);

        assertFalse(myRadiator.engineComponent());

    }

}