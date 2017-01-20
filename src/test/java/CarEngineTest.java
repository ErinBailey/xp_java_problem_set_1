import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 1/20/17.
 */
public class CarEngineTest {

    @Test
    public void createCarEngine_takesSixProperties() {
        CarEngine myEngine = new CarEngine("Mopar", 12345, "a sick engine, indeed", 2.4f, 0.7f, true, 0.0f, 0.0f);
        assertEquals(myEngine.manufacturer, "Mopar");
        assertEquals(myEngine.partNumber, 12345);
        assertEquals(myEngine.description, "a sick engine, indeed");
        assertEquals(myEngine.displacement, 2.4f, 0.0002);
        assertEquals(myEngine.compressionRatio, 0.7f, 0.0002);
        assertEquals(myEngine.isPetrol, true);
        assertEquals(myEngine.price, 0.0f, 0.00);
        assertEquals(myEngine.subTotal, 0.0f, 0.00);
    }

    @Test
    public void fullDescription_returnsAStringContainingAllAttributes() {
        CarEngine myEngine = new CarEngine("Audi", 12345, "Sick engine, brah", 4.0f, 3.33f, false, 0.0f, 0.0f);
        String stringDescription = "manufacturer: Audi, partNumber: 12345, description: Sick engine, brah, displacement: 4.0 litres, compressionRatio: 3.33, engineType: Diesel";
        assertEquals(myEngine.fullDescription(), stringDescription);
    }

    @Test
    public void coolingSystemComponent_returnsTrueIfComponentIsACoolingSystemComponent(){
        CarEngine myEngine = new CarEngine("Audi", 12345, "Sick engine, brah", 4.0f, 3.33f, false, 0.0f, 0.0f);
        assertFalse(myEngine.coolingSystemComponent());
    }

    @Test
    public void engineComponent_returnsTrueIfPartIsEngineComponent() {
        CarEngine myEngine = new CarEngine("Audi", 12345, "Sick engine, brah", 4.0f, 3.33f, false, 0.0f, 0.0f);

        assertTrue(myEngine.engineComponent());
    }
}