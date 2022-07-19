package com.bridgelabz;

public class Contact {
    private static String firstName;
    private static String lastName;
    private static String address;
    private static String city;
    private static String state;
    private static String zipCode;
    private static String phoneNumber;
    private static String email;

    public Contact() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        Contact.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        Contact.lastName = lastName;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Contact.address = address;
    }

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        Contact.city = city;
    }

    public static String getState() {
        return state;
    }

    public static void setState(String state) {
        Contact.state = state;
    }

    public static String getZipCode() {
        return zipCode;
    }

    public static void setZipCode(String zipCode) {
        Contact.zipCode = zipCode;
    }

    public static String getPhoneNumber() {
        return phoneNumber;
    }

    public static void setPhoneNumber(String phoneNumber) {
        Contact.phoneNumber = phoneNumber;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Contact.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", Address='" + address + '\'' +
                ", City='" + city + '\'' +
                ", State='" + state + '\'' +
                ", Zip='" + zipCode + '\'' +
                ", Phone Number='" + phoneNumber + '\'' +
                ", Email Address='" + email + '\'' +
                '}';
    }
}
