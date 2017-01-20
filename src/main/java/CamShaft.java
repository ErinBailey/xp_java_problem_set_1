/**
 * Created by localadmin on 1/20/17.
 */
public class CamShaft extends EngineSystemParts {
    int duration;
    int lift;
    boolean timing;

    CamShaft(String manufacturer, int partNumber, String description, int duration, int lift, boolean timing, float price, float subTotal) {
        super(manufacturer, partNumber, description, price, subTotal);
        this.duration = duration;
        this.lift = lift;
        this.timing = timing;

    }
    String fullDescription(){
        String returnString = "manufacturer: "+this.manufacturer+", partNumber: "+this.partNumber+", description: "+this.description+", duration: "+this.duration+" ms, lift: "+this.lift+", timing: "+timing;
        return returnString;
    }

}
