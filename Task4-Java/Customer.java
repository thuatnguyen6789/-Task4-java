package session4;

import java.util.Scanner;

public class Customer {
        // Declare instance variables
        int customerID;
        String customerName;
        String customerAddress;
        int customerAge;

        void displayCustomerInformation () {
            System.out.println("Customer Identification Number: " + customerID);
            System.out.println("Customer Name: " + customerName);
            System.out.println("Customer Address: " + customerAddress);
            System.out.println("Customer Age: " + customerAge);
        }
        void inputInfor() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Customer Name:");
            customerName = scan.nextLine();
            System.out.println("Enter the Customer Age:");
            customerAge = scan.nextInt();
            System.out.println("Enter the Customer Address:");
            customerAddress = scan.nextLine();
            System.out.println("Enter the Customer ID:");
            customerID = scan.nextInt();
        }

    public static void main(String[] args) {
        Customer objCustomer = new Customer();
        objCustomer.inputInfor();
        objCustomer.displayCustomerInformation();
    }
}
