package n3exercici1;

public class Start implements Command{
    private Vehicle vehicle;
    public Start(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute(){
        vehicle.start();
    }
}
