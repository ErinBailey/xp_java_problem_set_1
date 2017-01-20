/**
 * Created by localadmin on 1/20/17.
 */
public class EngineSystemParts extends CarParts {
    EngineSystemParts(String manufacturer, int partNumber, String description, float price, float subTotal) {
        super(manufacturer, partNumber, description, price, subTotal);
    }
    boolean coolingSystemComponent(){
        return false;
    }
    boolean engineComponent(){
        return true;
    }
}
