package lesson7homework;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int condition = 0;
        Scanner scan = new Scanner(System.in);
        do {

            int firstNumber = 0;
            int secondNumber = 0;
            int sumOfNumbers = 0;
            System.out.println("Please provide first number and press Enter: ");
            firstNumber = scan.nextInt();
            System.out.println("Please provide second number and press Enter: ");
            secondNumber = scan.nextInt();
            sumOfNumbers = firstNumber + secondNumber;
            System.out.println("Sum of entered numbers: " + sumOfNumbers);
            System.out.println("If you wont to try again press 1 and Enter: ");
            condition = scan.nextInt();
        } while (condition == 1);
        scan.close();
    }
}
