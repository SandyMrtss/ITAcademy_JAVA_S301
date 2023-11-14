package n2exercici1;

import java.util.Scanner;

public class Main {
    public static void showOptionsMain(){
        System.out.println("What do you want to do?:\n" +
                "1.- Add new contact\n" +
                "2.- Show contacts\n" +
                "0.- Exit");
    }
    public static void showOptionsAdd(){
        System.out.println("What kind of contact is it?:\n" +
                "1.- National\n" +
                "2.- International\n" +
                "0.- Exit");
    }
    public static void askStreet(){
        System.out.println("Please introduce street");
    }
    public static void askNumberFloorDoor(){
        System.out.println("Please introduce number, floor and/or door");
    }public static void askCity(){
        System.out.println("Please introduce city");
    }public static void askProvince(){
        System.out.println("Please introduce province/state/region");
    }public static void askZipCode(){
        System.out.println("Please introduce ZipCode");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Directory myDirectory = new Directory();
        boolean isExit = false;
        while (!isExit){
            showOptionsMain();
            int option = in.nextInt();
            switch (option){
                case 1:
                    System.out.println("What's the contact's name?");
                    Contact contact;
                    String name = in.nextLine().trim();
                    showOptionsAdd();
                    int type = in.nextInt();
                    if(type == 1){
                        System.out.println("Please introduce phone number without prefix and without whitespaces");
                        int number = in.nextInt();
                        NationalPhone phone = new NationalPhone(number);
                        System.out.println("Please introduce address information:");
                        askStreet();
                        String street = in.nextLine().trim();
                        askNumberFloorDoor();
                        String numberFloorDoor = in.nextLine().trim();
                        askZipCode();
                        int zipcode = in.nextInt();
                        askCity();
                        String city = in.nextLine().trim();
                        askProvince();
                        String province = in.nextLine().trim();
                        NationalAddress address = new NationalAddress(street, numberFloorDoor, zipcode, city, province);
                        contact = new Contact(name, phone, address);
                    }
                    else{
                        System.out.println("Please introduce country");
                        String country = in.nextLine().trim();
                        System.out.println("Please introduce phone number without prefix and without whitespaces");
                        int number = in.nextInt();
                        InternationalPhone phone = new InternationalPhone(country, number);
                        System.out.println("Please introduce address information:");
                        askStreet();
                        String street = in.nextLine().trim();
                        askNumberFloorDoor();
                        String numberFloorDoor = in.nextLine().trim();
                        askZipCode();
                        String zipcode = in.nextLine().trim();
                        askCity();
                        String city = in.nextLine().trim();
                        askProvince();
                        String province = in.nextLine().trim();
                        InternationalAddress address = new InternationalAddress(street, numberFloorDoor, zipcode, city, province, country);
                        contact = new Contact(name, phone, address);
                    }
                    myDirectory.addContact(contact);
            }
        }

    }
}
