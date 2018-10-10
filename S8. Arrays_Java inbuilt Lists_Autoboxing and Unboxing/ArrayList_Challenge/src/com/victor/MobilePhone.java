package com.victor;

import java.util.ArrayList;

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

class MobilePhone {

    // declare a variable which holds ArrayList of Contact
    private ArrayList<Contact> myContacts;

    //constructor
    public MobilePhone() {
        this.myContacts = new ArrayList<>();
    }
// we don't create getter because it's empty, we gonna add elements by method
/*    public ArrayList<Contact> getMyContacts() {
        return myContacts;
    }*/

    // methods to find a contact. As input parameter - contact record (class). Output parameter - index
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    // method to find contact by name
    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        } else {
            return null;
        }
    }

    // method to add contacts
    // When adding or updating be sure to check if the contact already exists (use name)
    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already exist");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position < 0) {
            System.out.println("Contact" + oldContact.getName() + " wasn't found");
            return false;
        } else {
            if (findContact(newContact.getName()) == -1) {
                myContacts.set(position, newContact);
                System.out.println("Contact " + oldContact.getName() + " was replaced with " + newContact.getName());
                return true;
            } else {
                System.out.println("Contact " + newContact.getName() + " is already in a list. Update wasn't successful.");
                return false;
            }
        }
    }
    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position >= 0) {
            this.myContacts.remove(position);
            System.out.println(contact.getName() + " was deleted");
            return true;
        } else {
            System.out.println("Contact" + contact.getName() + " not found");
            return false;
        }
    }

    public void printContacts() {
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i+1) + "." +
                    this.myContacts.get(i).getName() + " - " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }

}
