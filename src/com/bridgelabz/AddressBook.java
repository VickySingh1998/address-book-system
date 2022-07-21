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
        details.setZipCode(scanner.nextLong());
        System.out.println("Enter the Phone Number ");
        details.setPhoneNumber(scanner.nextLong());
        System.out.println("Enter the Email ");
        details.setEmail(scanner.next());

        contactDetails.add(details);
    }
    public void editDetails() {

        System.out.println("Confirm your first name to edit details: ");
        String name = scanner.next();

        for (int i = 0; i < contactDetails.size(); i++) {
            if (contactDetails.get(i).getFirstName().equals(name)) {
                System.out.println("Select from below option to change: ");
                System.out.println("\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Email\n7.Zip\n8.Phone number");
                int check = scanner.nextInt();

                switch (check) {
                    case 1:
                        System.out.println("Enter First Name");
                        contactDetails.get(i).setFirstName(scanner.next());
                        break;
                    case 2:
                        System.out.println("Enter Last Name");
                        contactDetails.get(i).setLastName(scanner.next());
                        break;
                    case 3:
                        System.out.println("Enter Address");
                        contactDetails.get(i).setAddress(scanner.next());
                        break;
                    case 4:
                        System.out.println("Enter City");
                        contactDetails.get(i).setCity(scanner.next());
                        break;
                    case 5:
                        System.out.println("Enter State");
                        contactDetails.get(i).setState(scanner.next());
                        break;
                    case 6:
                        System.out.println("Enter Zip");
                        contactDetails.get(i).setZipCode(scanner.nextInt());
                        break;
                    case 7:
                        System.out.println("Enter phone number");
                        contactDetails.get(i).setPhoneNumber(scanner.nextInt());
                        break;
                    case 8:
                        System.out.println("Enter Email");
                        contactDetails.get(i).setEmail(scanner.next());
                        break;
                }
                System.out.println(contactDetails);
            } else
                System.out.println("Enter valid First name");
        }

    }
    public void display() {

        System.out.println(contactDetails);
    }

    public static void main(String[] args) {

        boolean check = false;
        System.out.println("Welcome to Address Book Management System");
        AddressBook details = new AddressBook();

        do {
            System.out.println("1.Add details.\n2.Display Contacts. \n3.Edit Contacts.");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    details.addDetails();
                    break;
                case 2:
                    details.display();
                    break;
                case 3:
                    details.editDetails();
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
