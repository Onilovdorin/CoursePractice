package Example;


import java.util.Random;
import java.util.Scanner;

public class JocZaruri {
    public static void main(String[] args) {

        int zar1;
        int zar2;
        int zar1Adversar;
        int zar2Adversar;

        int victoriileMele = 0;
        int victoriileAdversar = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Doriti sa jucati? Scorul tau: " + victoriileMele + " / Scorul adversarului: " + victoriileAdversar);
            String raspuns = sc.nextLine();
            if (raspuns.equals("da")) {
                Random generator = new Random();
                zar1 = generator.nextInt(6) + 1;
                zar2 = generator.nextInt(6) + 1;
                zar1Adversar = generator.nextInt(6) + 1;
                zar2Adversar = generator.nextInt(6) + 1;

                System.out.println("Ai dat " + zar1 + " " + zar2);
                System.out.println("Oponentul a dat " + zar1Adversar + " " + zar2Adversar);

                int scorulMeu = zar1 + zar2;
                int scorulAdversar = zar1Adversar + zar2Adversar;

                if (scorulMeu > scorulAdversar) {
                    victoriileMele++;
                    System.out.println("Ai castigat");
                } else if (scorulMeu < scorulAdversar) {
                    victoriileAdversar++;
                    System.out.println("Ai pierdut");
                } else {
                    System.out.println("Este remiza");
                }

                if (victoriileMele == 6) {
                    System.out.println("Ai castigat jocul");
                    break;
                } else if (victoriileAdversar == 6) {
                    System.out.println("Ai pierdut jocul");
                    break;
                }

            } else if (raspuns.equals("nu")) {
                System.out.println("Va mai asteptam pe la noi");
                break;
            } else {
                System.out.println("Introdu da sau nu");
            }
        }
    }
}



