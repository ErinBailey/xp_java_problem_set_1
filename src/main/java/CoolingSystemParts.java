/**
 * Created by localadmin on 1/20/17.
 */
public class CoolingSystemParts extends CarParts {

    CoolingSystemParts(String manufacturer, int partNumber, String description, float price, float subTotal) {
            super(manufacturer, partNumber, description, price, subTotal);
    }
    boolean coolingSystemComponent(){
        return true;
    }
    boolean engineComponent(){
        return false;
    }
}
