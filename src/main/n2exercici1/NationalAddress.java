package n2exercici1;

public class NationalAddress implements Address{

    private String street;
    private String numberFloorDoor;
    private int zipcode;
    private String city;
    private String province;
    private static final String country = "Spain";

    @Override
    public String toString() {
        return String.format("Street: %s %s %05d, %s, %s, %s", street, numberFloorDoor, zipcode, city, province, country);
    }

    public NationalAddress(String street, String numberFloorDoor, int zipcode, String city, String province) {
        this.street = street;
        this.numberFloorDoor = numberFloorDoor;
        this.zipcode = zipcode;
        this.city = city;
        this.province = province;
    }
}
