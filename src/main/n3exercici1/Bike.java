package n3exercici1;

public class Bike extends Vehicle{

    public Bike() {
        super();
    }

    @Override
    public void accelerate() {
        System.out.println("The bike is accelerating");
    }

    @Override
    public void start() {
        System.out.println("The bike is starting");
    }

    @Override
    public void slowDown() {
        System.out.println("The bike is slowing down");
    }
}
