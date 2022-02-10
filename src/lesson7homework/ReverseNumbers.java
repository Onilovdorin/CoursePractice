package lesson7homework;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number :");
        int nr = scanner.nextInt();
        do {
            System.out.print(nr % 10);
            nr = nr / 10;
        }
        while (nr != 0);

        scanner.close();
    }
}

