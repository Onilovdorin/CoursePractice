package lesson17.homework;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word");
        String forwardWord = input.nextLine();

        char[] forwardWordChar = forwardWord.toCharArray();

        for (int i = forwardWordChar.length - 1; i > -1; i--){
            System.out.print(forwardWordChar[i]);
        }
        input.close();
    }
}
