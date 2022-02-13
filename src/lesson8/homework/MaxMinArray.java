package lesson8.homework;

public class MaxMinArray {
    public static void main(String[] args) {

        int intArr[] = {9, 22, -6, 10, -18, 33, 45, 4, 7};

        int maxValue = 0;
        int minValue = 0;

        for (int i = 1; i < intArr.length; i++) {
            if (maxValue < intArr[i]) {
                maxValue = intArr[i];
            } else if (minValue > intArr[i]) {
                minValue = intArr[i];
            }
        }
        System.out.println("Maxim value: " + maxValue);
        System.out.println("Minim value: " + minValue);
    }
}
