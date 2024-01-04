package n3exercici1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();
        Boat boat = new Boat();
        Plane plane = new Plane();

        List<Vehicle> myVehicles = new ArrayList<>();
        myVehicles.add(bike);
        myVehicles.add(car);
        myVehicles.add(boat);
        myVehicles.add(plane);

        System.out.println("Let's start our vehicles");
        for (Vehicle vehicle : myVehicles){
            Parking.start(vehicle);
        }

        System.out.println("Let's accelerate our vehicles");
        for (Vehicle vehicle : myVehicles){
            Parking.accelerate(vehicle);
        }

        System.out.println("Let's slow down our vehicles");
        for (Vehicle vehicle : myVehicles){
            Parking.slowDown(vehicle);
        }
    }
}
