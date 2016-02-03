package semana1;

/**
 * Created by JoãoGabriel on 25/01/2016.
 */
import java.util.*;
import java.io.*;

public class Orders {
    public ArrayList <Vehicle> orders;

    Scanner scan = new Scanner(System.in);

    public Orders() {
        orders = new ArrayList();
    }

    public void menuCar(String model, String color, double cost){
        System.out.print("What type of car is this?\n" +
                "1. Sedan\n" +
                "2. Coupe\n" +
                "3. Wagon\n" +
                "Choice: ");
        int type = scan.nextInt();

        System.out.print("Does this car have a towing package?\n" +
                "1. Yes\n" +
                "2. No\n" +
                "Choice: "
        );
        int tPackage = scan.nextInt();

        //Construct to Car
        Car car = new Car(model, color, cost, type, tPackage);
        orders.add(car);
    }

    private void menuTruck(String model, String color, double cost) {
        System.out.print("What size Truck is this?\n" +
                         "1. Half-ton\n" +
                         "2. Full ton\n" +
                         "Choice: ");
        int capacity = scan.nextInt();

        System.out.print("What is the engine size of the Truck?\n" +
                         "1. Really big\n" +
                         "2. Not so big\n +" +
                         "Choice: ");
        int engine = scan.nextInt();

        //Construct to Truck
        Truck truck = new Truck(model, color, cost, capacity, engine);
        orders.add(truck);
    }

    public void systemRun(){
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        String choice;
        String model;
        String color;
        double cost;


        while(loop){
            System.out.println("Do you want to order a Truck(T/t) or Car(C/c)?");
            choice = scan.nextLine();

            //Error message
            if(!choice.toLowerCase().equals("c") && !choice.toLowerCase().equals("t")) {
                System.out.println("Please, choose between (T/t) for Trucks, and (C/c) for Cars.");
            } else {
                System.out.println("Entering Car order:");
                System.out.print("Model: ");
                model = scan.nextLine();

                System.out.print("Color: ");
                color = scan.nextLine();

                System.out.print("Cost: ");
                cost = scan.nextDouble();
            }

            if(choice.toLowerCase().equals("c")){
                menuCar(model, color, cost);
            } else {
                menuTruck(model, color, cost);
            }
            System.out.print("Do you want to order another vehicle? (Y/y or N/n) ");
            choice = scan.nextLine();
            if(choice.toLowerCase().equals("n"))
                loop = false;
        }
    }

    public static void main (String[] args){

        Orders orders = new Orders();
        orders.systemRun();
    }
}
