package n3exercici1;

public class Plane extends Vehicle{
    public Plane() {
        super();
    }

    @Override
    public void accelerate() {
        System.out.println("The plane is accelerating");
    }

    @Override
    public void start() {
        System.out.println("The plane is starting");
    }

    @Override
    public void slowDown() {
        System.out.println("The plane is slowing down");
    }
}
