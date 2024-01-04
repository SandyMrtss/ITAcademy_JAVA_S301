package n2exercici1;

import java.util.Scanner;

public class InternationalFactory implements AbstractFactory {
    private String country;

    private static Scanner in = new Scanner(System.in);

    public Contact createInternationalContact(){
        System.out.println("What's the contact's name?");
        String name = in.nextLine().trim();
        System.out.println("Please introduce phone number without prefix and without whitespaces");
        int number = in.nextInt();
        System.out.println("Please input address information");
        in.nextLine();
        System.out.println("Street: ");
        String street = in.nextLine().trim();
        System.out.println("Number floor and/or door: ");
        String numberFloorDoor = in.nextLine().trim();
        System.out.println("City: ");
        String city = in.nextLine().trim();
        System.out.println("Province/State/Region: ");
        String province = in.nextLine().trim();
        System.out.println("ZipCode: ");
        String zipcode = in.nextLine().trim();
        System.out.println("Country: ");
        this.country = in.nextLine().trim().toUpperCase();
        InternationalPhone phone = (InternationalPhone) createPhoneNumber(country, number);
        InternationalAddress address = (InternationalAddress) createAddress(street, numberFloorDoor, zipcode, city, province, country);
        return new Contact(name, phone, address);
    }

    @Override
    public Phone createPhoneNumber(String country, int number){
        Phone phone;
        while(true){
            try{
                phone = new InternationalPhone(this.country, number);
                return phone;
            }
            catch (NoSuchFieldException ex){
                System.err.println(ex.getMessage());
            }
            System.out.println("Please input valid country");
            this.country = in.nextLine().trim().toUpperCase();
        }
    }

    @Override
    public Address createAddress(String street, String numberFloorDoor, String zipcode, String city, String province, String country) {
        return new InternationalAddress(street, numberFloorDoor, zipcode, city, province, country);
    }
}
