package n3exercici1;

public class Boat extends Vehicle{
    public Boat() {
        super();
    }

    @Override
    public void accelerate() {
        System.out.println("The boat is accelerating");
    }

    @Override
    public void start() {
        System.out.println("The boat is starting");
    }

    @Override
    public void slowDown() {
        System.out.println("The boat is slowing down");
    }
}
