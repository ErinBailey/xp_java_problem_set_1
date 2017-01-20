import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 1/20/17.
 */
public class FanBladeTest {
    @Test
    public void createFanBlade_takesSixProperties() {
        FanBlade myFanBlade = new FanBlade("Mopar", 12345, "a cool fanblade", 4, 80, 0.0f, 0.0f);
        assertEquals(myFanBlade.manufacturer, "Mopar");
        assertEquals(myFanBlade.partNumber, 12345);
        assertEquals(myFanBlade.description, "a cool fanblade");
        assertEquals(myFanBlade.bladeCount, 4);
        assertEquals(myFanBlade.diameterInCentimeters, 80);
        assertEquals(myFanBlade.price, 0.0f, 0.00);
        assertEquals(myFanBlade.subTotal, 0.0f, 0.00);
    }

    @Test
    public void fullDescription_returnsAStringContainingAllAttributes() {
        FanBlade myFanBlade = new FanBlade("Audi", 12345, "a cool fanblade", 4, 80, 0.0f, 0.0f);
        String stringDescription = "manufacturer: Audi, partNumber: 12345, description: a cool fanblade, bladeCount: 4, diameterInCentimeters: 80 cm";
        assertEquals(myFanBlade.fullDescription(), stringDescription);
    }

    @Test
    public void coolingSystemComponent_returnsTrueIfComponentIsACoolingSystemComponent(){
        FanBlade myFanBlade = new FanBlade("Mopar", 12345, "a cool fanblade", 4, 80, 0.0f, 0.0f);
        assertTrue(myFanBlade.coolingSystemComponent());
    }

    @Test
    public void engineComponent_returnsTrueIfPartIsEngineComponent() {
        FanBlade myFanBlade = new FanBlade("Mopar", 12345, "a cool fanblade", 4, 80, 0.0f, 0.0f);

        assertFalse(myFanBlade.engineComponent());
    }

}