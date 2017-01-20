import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 1/20/17.
 */
public class EngineSystemPartsTest {
    @Test
    public void test_boolean_for_engine_system(){
        EngineSystemParts myEngineParts= new EngineSystemParts("Audi", 5, "rad", 0.0f, 0.0f);
        assertFalse(myEngineParts.coolingSystemComponent());
        assertTrue(myEngineParts.engineComponent());
        assertEquals(myEngineParts.price, 0.0f, 0.00);
        assertEquals(myEngineParts.subTotal, 0.0f, 0.00);
    }

}