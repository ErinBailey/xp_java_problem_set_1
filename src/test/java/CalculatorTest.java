import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 1/20/17.
 */
public class CalculatorTest {
    @Test
    public void createCalculator() {
        CarEngine myFirstCarEngine = new CarEngine("Mopar", 12345, "a sick engine, indeed", 2.4f, 0.7f, true, 0.0f, 0.0f);
        ArrayList<CarParts> myArray = new ArrayList<>();
        myArray.add(myFirstCarEngine);
        Calculator myCalc = new Calculator(myArray);
        assertEquals(myFirstCarEngine, myCalc.myArray.get(0));
    }

    @Test
    public void calculateTotalofTaxExemptParts(){
        CarEngine myFirstCarEngine = new CarEngine("Mopar", 12345, "a sick engine, indeed", 2.4f, 0.7f, true, 1000.0f, 1000.0f);
        ArrayList<CarParts> myArray = new ArrayList<>();
        myArray.add(myFirstCarEngine);
        Calculator myCalc = new Calculator(myArray);
        assertEquals(myCalc.calculateTax(), 1000.00f, .001);
    }

    @Test
    public void calculateTaxableAndTaxExemptParts(){
        CarEngine myFirstCarEngine = new CarEngine("Mopar", 12345, "a sick engine, indeed", 2.4f, 0.7f, true, 1000.0f, 1000.0f);
        CamShaft myFirstCamShaft = new CamShaft("Mopar", 321, "Shaft!  Can ya dig it?", 120, 5, true, 100.0f, 100.0f);
        ArrayList<CarParts> myArray = new ArrayList<>();
        myArray.add(myFirstCarEngine);
        myArray.add(myFirstCamShaft);
        Calculator myCalc = new Calculator(myArray);
        assertEquals(myCalc.calculateTax(), 1110.00f, .001);
    }
    @Test
    public void overTheTopCalculateTaxableAndTaxExemptParts(){
        CarEngine myFirstCarEngine = new CarEngine("Mopar", 12345, "a sick engine, indeed", 2.4f, 0.7f, true, 1000.0f, 1000.0f);
        CamShaft myFirstCamShaft = new CamShaft("Mopar", 321, "Shaft!  Can ya dig it?", 120, 5, true, 100.0f, 100.0f);
        CarEngine mySecondCarEngine = new CarEngine("Mopar", 12345, "a sick engine, indeed", 2.4f, 0.7f, true, 1200.0f, 1200.0f);
        CamShaft mySecondCamShaft = new CamShaft("Mopar", 321, "Shaft!  Can ya dig it?", 120, 5, true, 340.0f, 340.0f);
        CarEngine myThirdCarEngine = new CarEngine("Mopar", 12345, "a sick engine, indeed", 2.4f, 0.7f, true, 1000.0f, 1000.0f);
        CamShaft myThirdCamShaft = new CamShaft("Mopar", 321, "Shaft!  Can ya dig it?", 120, 5, true, 100.0f, 100.0f);
        ArrayList<CarParts> myArray = new ArrayList<>();
        myArray.add(myFirstCarEngine);
        myArray.add(mySecondCarEngine);
        myArray.add(myThirdCarEngine);
        myArray.add(myFirstCamShaft);
        myArray.add(mySecondCamShaft);
        myArray.add(myThirdCamShaft);
        Calculator myCalc = new Calculator(myArray);
        assertEquals(myCalc.calculateTax(), 3794.0f, .001);
    }
}