package n2exercici1;

public class Contact {
    private Phone phoneNumber;
    private Address address;
    private String name;

    public Contact(String name, Phone phoneNumber, Address address) {
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + phoneNumber + address;
    }
}
