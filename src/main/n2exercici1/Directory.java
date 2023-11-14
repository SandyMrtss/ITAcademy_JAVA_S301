package n2exercici1;

import java.util.ArrayList;

public class Directory {
    private ArrayList<Contact> contacts;

    {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact){
        contacts.add(contact);
        System.out.println("Contact added succesfully");
    }

    public void showDirectory(){
        for(Contact contact: contacts){
            System.out.println(contact);
        }
    }

}
