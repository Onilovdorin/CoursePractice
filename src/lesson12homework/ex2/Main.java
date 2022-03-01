package lesson12homework.ex2;

public class Main {

    public static void main(String[] args) {

        int counter = PrimeNumbers.getCountPrimeNumbers(0, 10000);
        System.out.println("In interval of 0 and 10000 are " + counter + " prime numbers.");
    }
}
