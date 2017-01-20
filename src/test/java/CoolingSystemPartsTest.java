import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 1/20/17.
 */
public class CoolingSystemPartsTest {

    @Test
    public void test_boolean_for_cooling_system(){
        CoolingSystemParts myCoolParts= new CoolingSystemParts("Audi", 5, "cool", 0.0f, 0.0f);
        assertTrue(myCoolParts.coolingSystemComponent());
        assertFalse(myCoolParts.engineComponent());
        assertEquals(myCoolParts.price, 0.0f, 0.00);
        assertEquals(myCoolParts.subTotal, 0.0f, 0.00);

    }
}