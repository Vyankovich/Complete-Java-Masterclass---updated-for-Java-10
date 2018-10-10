package com.victor;

/**
 * Created by dev on 07.10.2018.
 */
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

public class Contact {

    private String name;
    private String phoneNumber;

    /*
     * we want to have list of contacts looking like this:
     * 1. Aaa; 11111
     * 2. Bbb; 22222
     * 3. Ccc; 33333
     * ...
     * so in order to create a contact record we want to have a method for it
     * this method must be static because we don't want to create a new separate object
     * */
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
