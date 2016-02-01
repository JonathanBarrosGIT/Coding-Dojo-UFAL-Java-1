package semana1;

/**
 * Created by JoãoGabriel on 25/01/2016.
 */

public class Truck extends Vehicle {
    private String capacity;
    private String engine;

    public Truck(String model, String color, double cost, String capacity, String engine){
        super(model, color, cost);
        this.capacity = capacity;
        this.engine = engine;
    }

    public String getCapacity(){
        return capacity;
    }

    public String getEngine(){
        return engine;
    }

    @Override
    public String toString(){
        return super.toString() + "Capacity: " + getCapacity() + "\n" +
                "Engine: " + getEngine();
    }
}
