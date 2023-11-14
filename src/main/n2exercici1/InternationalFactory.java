package n2exercici1;

public class InternationalFactory implements AbstractFactory {

    @Override
    public Phone createPhoneNumber(String country, int number) {
        return new InternationalPhone(country, number);
    }

    @Override
    public Address createAddress(String street, String numberFloorDoor, String zipcode, String city, String province, String country) {
        return new InternationalAddress(street, numberFloorDoor, zipcode, city, province, country);
    }
}
