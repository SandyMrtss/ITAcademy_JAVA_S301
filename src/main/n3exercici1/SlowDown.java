package n3exercici1;

public class SlowDown implements Command{
    @Override
    public void execute(){
        System.out.println("The vehicle is slowing down");
    }
}
