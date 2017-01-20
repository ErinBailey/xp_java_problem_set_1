/**
 * Created by localadmin on 1/20/17.
 */
public class CarParts {
    String manufacturer;
    int partNumber;
    String description;
    float price;
    float subTotal;

    CarParts(String manufacturer, int partNumber, String description, float price, float subTotal){
        this.manufacturer = manufacturer;
        this.partNumber = partNumber;
        this.description = description;
        this.price = price;
        this.subTotal = subTotal;

    }
    boolean isTaxExempt(){
        return false;
    }
}
