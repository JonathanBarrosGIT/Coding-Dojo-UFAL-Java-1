package semana1;

/**
 * Created by JoãoGabriel on 25/01/2016.
 */
import java.util.*;
import java.io.*;

public class Orders {
    public ArrayList orders = new ArrayList();

    public void systemRun(){
        boolean loop = true;
        String choice;
        Scanner scan = new Scanner(System.in);

        while(loop){
            System.out.println("Do you want to order a Truck(T/t) or Car(C/c)?");
            choice = scan.nextLine();

            //Error message
            if(choice.toLowerCase()!= "c" && choice.toLowerCase()!= "t"){
                System.out.println("Please, choose between (T/t) for Trucks, and (C/c) for Cars.");
            }

            if(choice.toLowerCase() == "c"){

                System.out.println("Entering Car order:");
                System.out.print("Model: ");
                String model = scan.nextLine();

                System.out.print("Color: ");
                String color = scan.nextLine();

                System.out.print("Cost: ");
                double cost = scan.nextDouble();

                System.out.print("What type of car is this?\n" +
                                    "1. Sedan\n" +
                                    "2. Coupe\n" +
                                    "3. Wagon\n" +
                                    "Choice: ");


                //Construct to Car
                Car car = new Car(model, color, cost, type, tPackage);

            } else {

            }


        }
    }

    public static void main (String[] args){

    }




}
