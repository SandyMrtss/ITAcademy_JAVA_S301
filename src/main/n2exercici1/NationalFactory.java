package n2exercici1;

public class NationalFactory implements AbstractFactory{
    @Override
    public Phone createPhoneNumber(String country, int number) {
        return new NationalPhone(number);
    }

    @Override
    public Address createAddress(String street, String numberFloorDoor, String zipcode, String city, String province, String country) {
        return new NationalAddress(street, numberFloorDoor, Integer.parseInt(zipcode), city, province);
    }
}
