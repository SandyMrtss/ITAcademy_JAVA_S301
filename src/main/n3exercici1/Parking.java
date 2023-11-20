package n3exercici1;


public class Parking {

    public static void park(Command command){
            command.execute();
    }
    public static void accelerate(Vehicle vehicle){
        Accelerate accelerate = new Accelerate(vehicle);
        accelerate.execute();
    }
}
