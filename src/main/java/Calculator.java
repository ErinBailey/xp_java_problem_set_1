import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by localadmin on 1/20/17.
 */
public class Calculator {
    ArrayList<CarParts> myArray = new ArrayList<CarParts>();

    public Calculator(ArrayList<CarParts> someArray) {
        this.myArray=someArray;
    }
    float calculateTax(){
        float total = 0;
        float nonTaxableTotal=0;
        for (CarParts carParts : myArray) {
            if(carParts.isTaxExempt())
                nonTaxableTotal += carParts.price;
            else
                total += carParts.price;
        }
        total *= 1.1f;

        total += nonTaxableTotal;
        return total;

    }

}
