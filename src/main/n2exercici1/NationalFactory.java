package n2exercici1;

import java.util.Scanner;

public class NationalFactory implements AbstractFactory{
    private static Scanner in = new Scanner(System.in);

    public Contact createNationalContact(){
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
        System.out.println("Province: ");
        String province = in.nextLine().trim();
        System.out.println("ZipCode: ");
        String zipcode = in.nextLine().trim();
        NationalPhone phone = (NationalPhone) createPhoneNumber("SPAIN", number);
        NationalAddress address = (NationalAddress) createAddress(street, numberFloorDoor, zipcode, city, province, "SPAIN");
        return new Contact(name, phone, address);
    }

    @Override
    public Phone createPhoneNumber(String country, int number) {
        return new NationalPhone(number);
    }

    @Override
    public Address createAddress(String street, String numberFloorDoor, String zipcode, String city, String province, String country) {
        return new NationalAddress(street, numberFloorDoor, Integer.parseInt(zipcode), city, province);
    }
}
