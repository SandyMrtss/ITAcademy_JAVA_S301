package n2exercici1;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static void showOptionsMain(){
        System.out.println("What do you want to do?\n" +
                "1.- Add new contact\n" +
                "2.- Show contacts\n" +
                "0.- Exit");
    }
    private static Phone getPhone(boolean isNational){
        if(isNational){
            System.out.println("Please introduce phone number without prefix and without whitespaces");
            int number = in.nextInt();
            return new NationalPhone(number);
        }
        else{
            System.out.println("Please introduce country");
            String country = in.nextLine().trim();
            System.out.println("Please introduce phone number without prefix and without whitespaces");
            int number = in.nextInt();
            return new InternationalPhone(country, number);
        }
    }
    private static Address getAddress(boolean isNational){
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
        if(!isNational){
            System.out.println("ZipCode");
            String zipcode = in.nextLine().trim();
            System.out.println("Country: ");
            String country = in.nextLine().trim();
            return new InternationalAddress(street, numberFloorDoor, zipcode, city, province, country);
        }
        else{
            System.out.println("ZipCode");
            int zipcode = in.nextInt();
            return new NationalAddress(street, numberFloorDoor, zipcode, city, province);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Directory myDirectory = new Directory();
        boolean isExit = false;
        while (!isExit){
            showOptionsMain();
            int option = in.nextInt();
            in.nextLine();
            switch (option){
                case 1:
                    Contact contact;
                    System.out.println("What's the contact's name?");
                    String name = in.nextLine().trim();
                    System.out.println("Is the contact national (true/false)");
                    boolean isNational = in.nextBoolean();
                    in.nextLine();
                    if(isNational){
                        NationalPhone phone = (NationalPhone) getPhone(isNational);
                        NationalAddress address = (NationalAddress) getAddress(isNational);
                        contact = new Contact(name, phone, address);
                    }
                    else{
                        InternationalPhone phone = (InternationalPhone) getPhone(isNational);
                        InternationalAddress address = (InternationalAddress) getAddress(isNational);
                        contact = new Contact(name, phone, address);
                    }
                    myDirectory.addContact(contact);
                    break;
                case 2:
                    myDirectory.showDirectory();
                    break;
                default:
                    isExit = true;
                    System.out.println("Goodbye");
            }
        }

    }
}
