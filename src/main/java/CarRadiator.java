/**
 * Created by localadmin on 1/20/17.
 */
public class CarRadiator extends CoolingSystemParts{
    float coolantPressure;

    CarRadiator(String manufacturer, int partNumber, String description, float coolantPressure, float price, float subTotal) {
        super(manufacturer, partNumber, description, price, subTotal);
        this.coolantPressure = coolantPressure;
    }
    String fullDescription(){
        return "manufacturer: " + manufacturer + ", partNumber: " + partNumber + ", description: " + description + ", coolantPressure: " + coolantPressure + " Pa";
    }

}
