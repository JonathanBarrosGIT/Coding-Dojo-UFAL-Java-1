package semana1;

/**
 * Created by JoãoGabriel on 25/01/2016.
 */
import java.util.Scanner;

public abstract class Vehicle {

    private String model;
    private String color;
    private double cost;

    public Vehicle(String model, String color, double cost){
        this.model = model;
        this.color = color;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getCost() {
        return cost;
    }

    public String toString(){
        return "Model: " + getModel() + "\n" +
                "Color: " + getColor() + "\n" +
                "Cost: " + getCost() + "\n";
    }
}
