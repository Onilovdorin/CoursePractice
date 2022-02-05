package Lesson5homework;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the first rectangle:");
        double latimeDreptunghi1 = scanner.nextDouble();
        System.out.println("Enter the length of the first rectangle:");
        double lungimeDreptunghi1 = scanner.nextDouble();
        double area1 = latimeDreptunghi1 * lungimeDreptunghi1;

        System.out.println("Enter the width of the second rectangle:");
        double latimeDreptunghi2 = scanner.nextDouble();
        System.out.println("Enter the length of the second rectangle:");
        double lungimeDreptunghi2 = scanner.nextDouble();
        double area2 = latimeDreptunghi2 * lungimeDreptunghi2;

        if (area1 > area2) {
            System.out.println("The first rectangle has a greater area!");
        } else {
            System.out.println("The second rectangle has a greater area!");
        }


    }
}







