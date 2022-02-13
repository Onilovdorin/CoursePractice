package lesson4.homework;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Introduceti pretul: ");

        double pret = a.nextDouble();
        double tax = a.nextDouble();
        int quantity = a.nextInt();

        a.close();

        System.out.println("Introduceti taxa: ");
        System.out.println("Introduceti cantitatea: ");


        double total;
        total = pret * tax * quantity;
        System.out.println("Total cost with tax is: " + total);
    }

}
