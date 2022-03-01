package lesson12homework.ex1;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        getAction(customer1);
        getAction(customer2);
        scanner.close();
        Customer[] clients = {customer1, customer2};
        System.out.println("Total profit:" + Customer.calculateTotalProfit(clients));
    }

    private static void getAction(Customer client) {
        System.out.println("Welcome to our cheap garage park!");
        System.out.print("How many hours do you want to park:");
        int hours = scanner.nextInt();
        client.setParkedHours(hours);
        client.calculateCharges();
        System.out.println("Customer fee: " + client.getClientCharge());
    }
}
