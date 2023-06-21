import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class ElectricityBillPaymentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Electricity Bill Payment System!");

        ArrayList<Customer> customers = new ArrayList<>();

        try {
            //  Customer details


                System.out.print("Enter the number of customers: ");
                int numCustomers = scanner.nextInt();




            for (int i = 0; i < numCustomers; i++)
            {

                // This loop for when the number of customer is zero ,is not working
                // I apologise for the inconvenience//
                if (numCustomers == 0)
                {
                    System.out.println("No customers to process. Exiting the program.");
                    return;
                }
                System.out.println("\nCustomer " + (i + 1));
                System.out.print("Enter customer name: ");
                scanner.nextLine();
                String customerName = scanner.nextLine();

                System.out.print("Enter customer ID: ");
                String customerID = scanner.nextLine();

                System.out.print("Enter unit consumed: ");
                int unitConsumed = scanner.nextInt();

                System.out.print("Residential (R) or Commercial (C) customer? ");
                String customerType = scanner.next();

                Customer customer;
                if (customerType.equalsIgnoreCase("R")) {
                    customer = new ResidentialCustomer(customerName, customerID, unitConsumed);
                } else if (customerType.equalsIgnoreCase("C")) {
                    customer = new CommercialCustomer(customerName, customerID, unitConsumed);
                } else {
                    System.out.println("Invalid customer type. Skipping customer.");
                    continue;
                }

                customers.add(customer);
            }

            // Process payment for each customer
            for (Customer customer : customers) {
                double billAmount = customer.calculateBillAmount();

                // Display bill details
                System.out.println("\nBill Details");
                System.out.println("Customer Name: " + customer.getName());
                System.out.println("Customer ID: " + customer.getID());
                System.out.println("Unit Consumed: " + customer.getUnitConsumed());
                System.out.println("Bill Amount: $" + billAmount);

                // Process payment
                System.out.print("\nEnter payment amount: $");
                double paymentAmount = scanner.nextDouble();

                if (customer.processPayment(paymentAmount, billAmount)) {
                    double change = paymentAmount - billAmount;
                    System.out.println("Payment successful!");
                    System.out.println("Change: $" + change);
                } else {
                    System.out.println("Payment failed! Insufficient amount.");
                }
            }

            System.out.println("Customer information processed successfully!");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
