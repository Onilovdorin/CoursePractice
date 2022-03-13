package lesson17.homework;

import java.util.Scanner;

public class NumberOfWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the words");
        String stringToProcess = input.nextLine();
        String stringProcessed = stringToProcess.trim().replaceAll(" +", " ");

        char[] stringProcessedChar = stringProcessed.toCharArray();

        int g = 0;

        for (char c : stringProcessedChar) {

            if (c == ' ') {
                g += 1;
            }
        }
        int numOfWords = g + 1;
        System.out.println("The number of words is - " + numOfWords);

        input.close();
    }
}
