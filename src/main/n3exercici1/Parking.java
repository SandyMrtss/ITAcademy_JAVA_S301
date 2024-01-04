package n3exercici1;

public class Parking {

    public static void accelerate(Vehicle vehicle){
        Accelerate accelerate = new Accelerate(vehicle);
        accelerate.execute();
    }
    public static void start(Vehicle vehicle){
        Start start = new Start(vehicle);
        start.execute();
    }
    public static void slowDown(Vehicle vehicle){
        SlowDown slowDown = new SlowDown(vehicle);
        slowDown.execute();
    }
}
