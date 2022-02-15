package lesson9.homework.pin;

import java.util.Scanner;

public class Pin {

    public static void main(String[] args) {
        final String PIN = "1234";
        printInfo(PIN);
    }

    public static String readPin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the pin: ");
        return scanner.next();
    }

    public static boolean checkPin(String userInput, final String PIN) {
        return PIN.equals(userInput);
    }

    public static void printInfo(final String PIN) {
        boolean flag = false;
        for (int i = 0; true; i++) {
            String userInput = readPin();
            if (checkPin(userInput, PIN)) {
                System.out.println("Correct, welcome back");
                flag = true;
                break;
            } else {
                if (i == 2) {
                    break;
                }
                System.out.println("Incorrect, try again.");
            }
        }
        if (!flag) {
            System.out.println("Sorry but you have been locked out");
        }
    }
}


