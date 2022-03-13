package lesson18.homework;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("one", "unu");
        dictionary.put("two", "doi");
        dictionary.put("three", "trei");
        dictionary.put("four", "patru");
        dictionary.put("five", "cinci");
        dictionary.put("six", "sase");
        dictionary.put("seven", "sapte");
        dictionary.put("eight", "opt");
        dictionary.put("nine", "noua");
        dictionary.put("ten", "zece");


        System.out.print("Write a number from 1 to 10 in letters : ");
        System.out.println(dictionary.get(input.next()));

        input.close();
    }
}
