package lesson8.homework;


public class OddEvenSum {
    public static void main(String[] args) {
        int oneDimensionalExample[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int twoDimensionalExample[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

        int evenSum = 0;
        double oddSum = 0;

        int twoEvenSum = 0;
        double twoOddSum = 0;

        for (int i : oneDimensionalExample) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        System.out.println("The sum of even numbers is: " + evenSum);

        int evenAverage = evenSum / oneDimensionalExample.length;
        System.out.println("The average of even number is: " + evenAverage);
        for (int i : oneDimensionalExample) {
            if (i % 2 != 0) {
                oddSum += i;
            }
        }
        System.out.println("The sum of odd numbers is: " + oddSum);
        double oddAverage = oddSum / oneDimensionalExample.length;
        System.out.println("The average of odd numbers is: " + oddAverage);

        for (int i = 0; i < twoDimensionalExample.length; i++) {
            for (int j = 0; j < twoDimensionalExample[i].length; j++) {
                if (twoDimensionalExample[i][j] % 2 == 0) {
                    twoEvenSum += twoDimensionalExample[i][j];
                }
            }
        }
        System.out.println("The sum of even numbers in two dimensional array is: " + twoEvenSum);
        int twoEvenAverage = twoEvenSum / 10;
        System.out.println("The average of even numbers in two dimensional array is: " + twoEvenAverage);

        for (int i = 0; i < twoDimensionalExample.length; i++) {
            for (int j = 0; j < twoDimensionalExample[i].length; j++) {
                if (twoDimensionalExample[i][j] % 2 != 0) {
                    twoOddSum += twoDimensionalExample[i][j];
                }
            }
        }
        System.out.println("The sum of even numbers in two dimensional array is: " + twoOddSum);
        double twoOddAverage = twoOddSum / 10;
        System.out.println("The average of even numbers in two dimensional array is: " + twoEvenAverage);
    }
}