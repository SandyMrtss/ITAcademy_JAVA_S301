package n3exercici1;

public class Accelerate implements Command{
    private Vehicle vehicle;
    public Accelerate(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public void execute() {
        vehicle.accelerate();
    }
}
