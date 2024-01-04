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
    private static NationalFactory nationalFactory = new NationalFactory();
    private static InternationalFactory internationalFactory = new InternationalFactory();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Directory myDirectory = new Directory();
        boolean isExit = false;
        while (!isExit){
            showOptionsMain();
            int option = in.nextInt();
            in.nextLine();
            switch (option) {
                case 1 -> {
                    System.out.println("Is the contact national (true/false)");
                    boolean isNational = in.nextBoolean();
                    in.nextLine();
                    Contact contact;
                    if (isNational) {
                        contact = nationalFactory.createNationalContact();
                    } else {
                        contact = internationalFactory.createInternationalContact();
                    }
                    myDirectory.addContact(contact);
                }
                case 2 -> myDirectory.showDirectory();
                default -> {
                    isExit = true;
                    System.out.println("Goodbye");
                }
            }
        }
    }
}
