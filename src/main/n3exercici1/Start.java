package n3exercici1;

public class Start implements Command{
    private Vehicle vehicle;

    @Override
    public void execute(){
        System.out.println("The vehicle is starting");
    }
}
