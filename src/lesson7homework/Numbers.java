package lesson7homework;

public class Numbers {
    public static void main(String[] args) {
        int number2 = 0;

        for (int number = 100; number <= 1000; number++) {
            if (number % 5 == 0 && number % 6 == 0) {
                System.out.print(number + " ");
                number2++;
                if (number2 % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}




