import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 1/20/17.
 */
public class CarPartsTest {

    @Test
    public void createCarPart_takesThreeProperties() {
        CarParts mycarPart = new CarParts("Mopar", 12345, "a sick engine, indeed", 0.0f, 0.0f);
        assertEquals(mycarPart.manufacturer, "Mopar");
        assertEquals(mycarPart.partNumber, 12345);
        assertEquals(mycarPart.description, "a sick engine, indeed");
        assertEquals(mycarPart.price, 0.0f, 0.00);
        assertEquals(mycarPart.subTotal, 0.0f, 0.00);
    }
}