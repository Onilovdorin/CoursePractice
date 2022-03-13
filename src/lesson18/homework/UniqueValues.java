package lesson18.homework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UniqueValues {

    public static void main(String[] args) {

        ArrayList<String> listOfStrings = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean menu = true;

        while (menu) {

            System.out.println("Add another element? - 1" +
                    "\n" + "Print the list of unique elements? - 2");

            int chs = input.nextInt();

            if (chs == 1) {
                System.out.println("Please enter the element");
                String elem = input.next();
                listOfStrings.add(elem);
            }

            if (chs == 2) {
                ArrayList<String> newList = (ArrayList<String>) listOfStrings.
                        stream().
                        distinct().
                        collect(Collectors.toList());

                System.out.println("The purged list is - " + newList);

                menu = false;
            }
        }
        input.close();
    }
}
