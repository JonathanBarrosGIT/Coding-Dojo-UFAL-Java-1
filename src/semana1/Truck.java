package semana1;

/**
 * Created by JoãoGabriel on 25/01/2016.
 */

public class Truck extends Vehicle {
    private String capacity;
    private String engine;

    public Truck(String model, String color, double cost,String capacity, String engine){
        this.capacity = capacity;
        this.engine = engine;
        super(model, color, cost);
    }
}
