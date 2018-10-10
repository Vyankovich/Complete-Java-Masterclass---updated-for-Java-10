package com.victor;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        // create a program that implements a simple phone with the following capabilities
        // able to store, modify, remove and query contact names.
        // you will want to c create a separate class for Contact (name and phone number).
        // create a master class (MobilePhone) that holds the ArrayList of Contact
        // the MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options: Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // e.g. no ints, no .get(i) etc.
        // MobilePhone should do everything with Contact objects only.

        // System.out.println(mobilePhone.getMyContacts()); // [] - empty list

        boolean quit = false;
        printActions();

        while (!quit) {
            System.out.println("Enter your choice:");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        mobilePhone.printContacts();
                        break;
                    case 2:
                        addNewContact();
                        break;
                    case 3:
                        updateContact();
                        break;
                    case 4:
                        removeContact();
                        break;
                    case 5:
                        queryContact();
                        break;
                    case 6:
                        System.out.println("The end! Bye!");
                        quit = true;
                        break;
                }
        }
        scanner.close();
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name:");
        String name = scanner.nextLine();
        System.out.println("Enter phone number:");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added. Name: " + name + ", Phone: " + phoneNumber);
        } else {
            System.out.println("Already in a list. Contact " + name + "wasn't added.");
        }
    }

    public static void queryContact() {
        System.out.println("Enter existing contact name:");
        String name = scanner.nextLine();
        Contact isRecordExist = mobilePhone.queryContact(name);
        if (isRecordExist == null) {
            System.out.println("Contact not found");
        }

        System.out.println("Name: " +isRecordExist.getName() + ", phoneNumber is " + isRecordExist.getPhoneNumber());
    }

    private static void updateContact() {
        System.out.println("Enter new contact name:");
        String name = scanner.nextLine();
        Contact isRecordExist = mobilePhone.queryContact(name);
        if (isRecordExist == null) {
            System.out.println("Contact not found");
        } else {
            System.out.println("Enter new contact name: ");
            String newName = scanner.nextLine();
            System.out.println("Enter phone number: ");
            String phoneNumber = scanner.nextLine();
            Contact newContact = Contact.createContact(newName, phoneNumber);
            if (mobilePhone.updateContact(isRecordExist, newContact)) {
                System.out.println("Successfully updated");
            } else {
                System.out.println("Error updating record");
            }
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name:");
        String name = scanner.nextLine();
        Contact isRecordExist = mobilePhone.queryContact(name);
        if (isRecordExist == null) {
            System.out.println("Contact not found");
        } else {
            if (mobilePhone.removeContact(isRecordExist)) {
                System.out.println("Deleted");
            } else{
                System.out.println("Error deleting contact");
            }
        }
    }

    // able to store, modify, remove and query contact names.
    public static void printActions() {
        System.out.println("Press ");
        System.out.println("\t 1 - To print contacts."); // \t = TAB
        System.out.println("\t 2 - To add new contact.");
        System.out.println("\t 3 - To update contact.");
        System.out.println("\t 4 - To remove a contact.");
        System.out.println("\t 5 - To search a contact.");
        System.out.println("\t 6 - To quit the application.");
    }

}



