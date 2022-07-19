package com.bridgelabz;

import java.util.*;

public class AddressBook {
    private static Scanner scanner = new Scanner(System.in);
    static ArrayList<Contact> contactDetail = new ArrayList<>();

    private static ArrayList<Contact> addContact() {
        Contact contact = new Contact();
        System.out.println("Enter First Name:");
        contact.setFirstName(scanner.nextLine());
        System.out.println("Enter Last Name:");
        contact.setLastName(scanner.nextLine());
        System.out.println("Enter Address:");
        contact.setAddress(scanner.nextLine());
        System.out.println("Enter City :");
        contact.setCity(scanner.nextLine());
        System.out.println("Enter State :");
        contact.setState(scanner.nextLine());
        System.out.println("Enter Zip Code :");
        contact.setZipCode(scanner.next());
        System.out.println("Enter Phone Number :");
        contact.setPhoneNumber(scanner.next());
        System.out.println("Enter Email :");
        contact.setEmail(scanner.next());

        contactDetail.add(contact);
        return contactDetail;
    }
    public static void main(String[] args) {
        addContact();
        System.out.println(contactDetail);
    }
}
