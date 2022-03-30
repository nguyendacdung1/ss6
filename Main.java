package com.company;

public class Main {
    int CustomerID;
    String CustomerName;
    String CustomerAddress;
    int CustomerAge;

    public static void main(String[] args) {
	// write your code here
        // Declares and instantiares an object of type Customer
        Customer objCustomer1 = new Customer();
        //Accesses the instance variables to store values
        objCustomer1.CustomerID=100;
        objCustomer1.CustomerName="John";
        objCustomer1.CustomerAddress="123 Street";
        objCustomer1.CustomerAge=30;

        //displays the objCustomer1 object details
        System.out.println("Customer Identification Number: " + objCustomer1.CustomerID);
        System.out.println("CustomerName: " + objCustomer1.CustomerName);
        System.out.println("CustomerAddress: " + objCustomer1.CustomerAddress);
        System.out.println("CustomerAge: " + objCustomer1.CustomerAge);
    }
}
