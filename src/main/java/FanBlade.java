/**
 * Created by localadmin on 1/20/17.
 */
public class FanBlade extends CoolingSystemParts {
        int bladeCount;
        int diameterInCentimeters;

    FanBlade(String manufacturer, int partNumber, String description, int bladeCount, int diameterInCentimeters, float price, float subTotal){
        super(manufacturer, partNumber, description, price, subTotal);
        this.bladeCount = bladeCount;
        this.diameterInCentimeters = diameterInCentimeters;

    }
    String fullDescription(){
        return "manufacturer: " + manufacturer + ", partNumber: " + partNumber + ", description: " + description + ", bladeCount: " + bladeCount + ", diameterInCentimeters: " + diameterInCentimeters + " cm";
    }

}
