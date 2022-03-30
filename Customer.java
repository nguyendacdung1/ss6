package com.company;


    public class Customer{
        public int customerID;
        public String customerName;
        public String customerAddress;
        public int customerAge;
        //Declare instance variables
        int CustomerID;
        String CustomerName;
        String CustomerAddress;
        int CustomerAge;

        /* As main ()  method is a member of class, so it can access other
        * Members of the class
         */
        public static void main(String[] args){
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

        public void displayCustomerInformation() {
            
        }

        public void changeCustomerAddress(String s) {
        }
    }

