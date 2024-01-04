package n2exercici1;

public interface AbstractFactory {
    Phone createPhoneNumber(String country, int number);

    Address createAddress(String street, String numberFloorDoor, String zipcode, String city, String province, String country);
}
