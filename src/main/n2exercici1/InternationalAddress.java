package n2exercici1;

public class InternationalAddress implements Address{
    private String street;
    private String numberFloorDoor;
    private String zipcode;
    private String city;
    private String province;
    private String country;

    @Override
    public String toString() {
        return String.format("Address: %s %s %s, %s, %s, %s", street, numberFloorDoor, zipcode, city, province, country);
    }

    public InternationalAddress(String street, String numberFloorDoor, String zipcode, String city, String province, String country) {
        this.street = street;
        this.numberFloorDoor = numberFloorDoor;
        this.zipcode = zipcode;
        this.city = city;
        this.province = province;
        this.country = country;
    }
}
