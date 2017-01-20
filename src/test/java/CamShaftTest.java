import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 1/20/17.
 */
public class CamShaftTest {
    @Test
    public void createCamShaft_takesSixProperties() {
        CamShaft myCamShaft = new CamShaft("Mopar", 12345, "a sick camshaft, indeed", 120, 5, true, 0.0f, 0.0f);
        assertEquals(myCamShaft.manufacturer, "Mopar");
        assertEquals(myCamShaft.partNumber, 12345);
        assertEquals(myCamShaft.description, "a sick camshaft, indeed");
        assertEquals(myCamShaft.duration, 120);
        assertEquals(myCamShaft.lift, 5);
        assertEquals(myCamShaft.timing, true);
        assertEquals(myCamShaft.price, 0.0f, 0.00);
        assertEquals(myCamShaft.subTotal, 0.0f, 0.00);
    }

    @Test
    public void fullDescription_returnsAStringContainingAllAttributes() {
        CamShaft myCamShaft = new CamShaft("Mopar", 12345, "Sick camshaft, brah", 120, 5, true, 0.0f, 0.0f);
        String stringDescription = "manufacturer: Mopar, partNumber: 12345, description: Sick camshaft, brah, duration: 120 ms, lift: 5, timing: true";
        assertEquals(myCamShaft.fullDescription(), stringDescription);
    }

    @Test
    public void coolingSystemComponent_returnsTrueIfComponentIsACoolingSystemComponent(){
        CamShaft myCamShaft = new CamShaft("Mopar", 12345, "a sick camshaft, indeed", 120, 5, true, 0.0f, 0.0f);
        assertFalse(myCamShaft.coolingSystemComponent());
    }

    @Test
    public void engineComponent_returnsTrueIfPartIsEngineComponent() {
        CamShaft myCamShaft = new CamShaft("Mopar", 12345, "a sick camshaft, indeed", 120, 5, true, 0.0f, 0.0f);

        assertTrue(myCamShaft.engineComponent());
    }

}