// Name: Ira Nikolaou 
// Student ID: 16061888 
// Assignment 5

import java.util.Arrays;
public class ContactList {

    private Contact[] contacts;
    private int nextContactPosition = 0;

    // Constructor Methods
    // Default 150 contacts capacity
    public ContactList() {
        this.contacts = new Contact[150];
    }

    // Adjustable contacts capacity
    public ContactList(int capacity) {
        this.contacts = new Contact[capacity];
    }

    // Add method - adjusted from the PlayList class used in lecture wekk 10
    public boolean add(Contact aContact) {

        if (nextContactPosition < contacts.length) {
            this.contacts[nextContactPosition] = aContact;
            this.nextContactPosition++;
            return true;
        }
        return false;

    }

    // nameFor method with start position
    public String nameFor(String number, int startPos) {
        for (int i = startPos; i < nextContactPosition; i++) {
            if (number.equals(this.contacts[i].getPhoneNumber())) {
                return this.contacts[i].getContactName();
            }
        }
        return "";
    }

    // numberFor method with start position
    public String numberFor(String name, int startPos) {
        for (int i = startPos; i < nextContactPosition; i++) {
            if (this.contacts[i].getContactName().contains(name)) {
                return this.contacts[i].getPhoneNumber();
            }
        }
        return "";
    }

    // nameFor method without start position
    public String nameFor(String number) {
        int startPos = 0;
        return this.nameFor(number, startPos);
    }

    // numberFor method without start position
    public String numberFor(String name) {
        int startPos = 0;
        return numberFor(name, startPos);
    }

    // display method
    public void display() {
        for (int i = 0; i < nextContactPosition; i++) {
            System.out.println("Contact " + (i + 1) + " of " + contacts.length);
            System.out.println(this.contacts[i].toString());
        }
    }

    // remove String method/operation
    public boolean remove(String name) {
        for (int i = 0; i < nextContactPosition; i++) {
            if (name.equals(contacts[i].getContactName())) {
                for (int n = i; n < nextContactPosition; n++) {
                    contacts[n] = contacts[n + 1];
                }
                this.nextContactPosition--;
                return true;
            }
        }
        return false;

    }

    // remove int method/operation
    public boolean remove(int position) {

        if (position < 0 || position > this.contacts.length) {
            return false;
        }

        for (int i = position; i < nextContactPosition; i++) {
            contacts[i] = contacts[i + 1];
        }
        this.nextContactPosition--;
        return true;
    }

    //the array.sort method applies the compareTo method that is set up in the contact class
    // This method is repurposed from the playlist example in lecture 20 part1
    public void sort() {
        Arrays.sort(contacts, 0, nextContactPosition);
    }
    
}

