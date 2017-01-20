/**
 * Created by localadmin on 1/20/17.
 */
public class CarEngine extends EngineSystemParts{
    float displacement;
    float compressionRatio;
    boolean isPetrol;

    CarEngine(String manufacturer, int partNumber, String description, float displacement, float cRatio, boolean isPetrol, float price, float subTotal) {
        super(manufacturer, partNumber, description, price, subTotal);
        this.displacement = displacement;
        this.compressionRatio = cRatio;
        this.isPetrol = isPetrol;

    }
    String fullDescription(){
        String engineType;
        if(isPetrol==true)
            engineType="Petrol";
        else engineType = "Diesel";
        String returnString = "manufacturer: "+this.manufacturer+", partNumber: "+this.partNumber+", description: "+this.description+", displacement: "+this.displacement+" litres, compressionRatio: "+this.compressionRatio+", engineType: "+engineType;
        return returnString;
    }

    @Override
    boolean isTaxExempt(){
        return true;
    }
}
