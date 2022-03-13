package lesson19.homework;

import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;

public class DaysCount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the year of the first date");
        int year1 = input.nextInt();

        System.out.println("Please enter the month of the first date");
        int month1 = input.nextInt();

        System.out.println("Please enter the day of the first date");
        int day1 = input.nextInt();


        System.out.println("Please enter the year of the second date");
        int year2 = input.nextInt();

        System.out.println("Please enter the month of the second date");
        int month2 = input.nextInt();

        System.out.println("Please enter the day of the second date");
        int day2 = input.nextInt();


        LocalDate localDate1 = LocalDate.of(year1, month1, day1);
        LocalDate localDate2 = LocalDate.of(year2, month2, day2);

        System.out.println(Period.between(localDate1, localDate2));

        input.close();
    }
}
