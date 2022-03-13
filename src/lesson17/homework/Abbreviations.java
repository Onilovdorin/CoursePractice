package lesson17.homework;

import java.util.Scanner;

public class Abbreviations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String name = input.nextLine();
        String nameProcessed = name.trim().replaceAll(" +", " ");

        char[] nameProcessedChar = nameProcessed.toCharArray();

        System.out.print("The abbreviation is " + nameProcessedChar[0] + ".");

        int g = 0;

        for (char c : nameProcessedChar) {

            if (c == ' ') {
                g += 1;
            }
        }
        int z = 0;

        for (int i = 0; i < nameProcessedChar.length; i++) {
            if (z < g - 1) {
                if (nameProcessedChar[i] == ' ') {
                    char a = nameProcessedChar[++i];

                    System.out.print(a + ".");

                    z++;
                }
            }
        }

        int theLastGap = 0;

        for (int i = 0; i < nameProcessedChar.length; i++) {
            if (nameProcessedChar[i] == ' ') {
                theLastGap = i;
            }
        }
        for (int i = theLastGap + 1; i < nameProcessedChar.length; i++) {
            System.out.print(nameProcessedChar[i]);
        }
        input.close();
    }
}
