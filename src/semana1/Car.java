package semana1;

/**
 * Created by JonathanBarros on 2/1/16.
 */
public class Car extends Vehicle{
    private String type;
    private String tPackage;

    public Car(String model, String color, double cost, String type, String tPackage){
        super(model, color, cost);
        this.type = type;
        this.tPackage = tPackage;
    }

    public String getType(){
        return type;
    }

    public String gettPackage(){
        return tPackage;
    }

    public String toString(){
        return super.toString() + "Type: " + getType() + "\n" +
                "Towing Package: " + gettPackage();
    }
}


