package lesson6homework;

import java.util.Scanner;

public class Thermometer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature:");
        double maxTemp = 65.7;
        double minTemp = -54.5;
        double temperature = scanner.nextDouble();

        if (temperature > maxTemp) {
            System.out.println("Porridge is too hot.");
        } else if (temperature < minTemp) {
            System.out.println("Porridge is too cold.");
        } else {
            System.out.println("Porridge is just right");
        }

        scanner.close();

    }
}
