package semana1;

/**
 * Created by JonathanBarros on 2/1/16.
 */
public class Car extends Vehicle{
    private String type;
    private boolean tPackage = false;

    public Car(String model, String color, double cost, int type, int tPackage){
        super(model, color, cost);
        if(type == 1)
            this.type = "Sedan";
        else if(type == 2)
            this.type = "Coupe";
        else
            this.type = "Wagon";

        this.tPackage = tPackage == 1;
    }

    public String getType(){
        return type;
    }

    public boolean gettPackage(){
        return tPackage;
    }

    public String toString(){
        return super.toString() + "Type: " + getType() + "\n" +
                "Towing Package: " + gettPackage();
    }
}


