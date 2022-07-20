package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> contactDetails = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public void addDetails() {

        Scanner scanner = new Scanner(System.in);
        Contact details = new Contact();
        System.out.println("Enter the First Name ");
        details.setFirstName(scanner.nextLine());
        System.out.println("Enter the Last Name ");
        details.setLastName(scanner.nextLine());
        System.out.println("Enter the Address ");
        details.setAddress(scanner.nextLine());
        System.out.println("Enter the City ");
        details.setCity(scanner.nextLine());
        System.out.println("Enter the State ");
        details.setState(scanner.nextLine());
        System.out.println("Enter the Zip Code ");
        details.setZipCode(scanner.nextInt());
        System.out.println("Enter the Phone Number ");
        details.setPhoneNumber(scanner.nextInt());
        System.out.println("Enter the Email ");
        details.setEmail(scanner.next());

        contactDetails.add(details);
    }
    public void display() {

        System.out.println(contactDetails);
    }

    public static void main(String[] args) {

        boolean check = false;
        System.out.println("Welcome to Address Book Management System");
        AddressBook details = new AddressBook();

        do {
            System.out.println("1.Add details.\n2.Display Contacts.");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    details.addDetails();
                    break;
                case 2:
                    details.display();
                    break;
                default:
                    System.out.println("Wrong option");
                    details.display();
                    break;
            }
        }
        while (!check);
    }
}
