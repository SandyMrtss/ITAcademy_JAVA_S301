package n3exercici1;

public class Car extends Vehicle{
    public Car() {
        super();
    }

    @Override
    public void accelerate() {
        System.out.println("The car is accelerating");
    }

    @Override
    public void start() {
        System.out.println("The car is starting");
    }

    @Override
    public void slowDown() {
        System.out.println("The car is slowing down");
    }
}
