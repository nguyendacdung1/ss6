package com.company;

public class example4 {
    //Declare instance variables
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;
    /**
     * Declares an instance method changeCustomerAddress is created to change
     * the address of the customer object
     */
    void changeCustomerAddress(String address) {
        customerAddress = address;
    }
    /**
     * Declares an instance method displayCustomerInformation is created to
     * display the details of the customer object
     */
    void displayCustomerInformation() {
        System.out.println("Customer Identification Number: " + customerID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Customer Age: " + customerAge);
    }
}

