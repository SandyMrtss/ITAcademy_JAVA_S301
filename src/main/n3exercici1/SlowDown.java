package n3exercici1;

public class SlowDown implements Command{
    private Vehicle vehicle;
    public SlowDown(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public void execute(){
        vehicle.slowDown();
    }
}
