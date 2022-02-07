package lesson5homework;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please insert the number : ");
        int inputNumber = keyboard.nextInt();

        if (inputNumber % 2 == 0) {
            System.out.println("The number " + inputNumber + " is EVEN");
        } else {
            System.out.println("The number " + inputNumber + " is ODD");
        }
        keyboard.close();
    }
}
