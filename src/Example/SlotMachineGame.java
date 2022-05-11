package Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SlotMachineGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Doriti sa incepem jocul? Introduceti da sau nu!");
        String raspuns = sc.nextLine();
        if (raspuns.equalsIgnoreCase("da")) {
            startGame();
        } else if (raspuns.equalsIgnoreCase("nu")) {
            System.out.println("Va mai asteptam pe la noi");
        } else {
            System.out.println("Nu ai introdus un raspuns valabil");
        }
    }

    public static void startGame() {
        double buget = 100;
        ArrayList<String> posibilitati = new ArrayList<>(Arrays.asList("DIAMANT", "CIREASA", "BAR"));
        Scanner sc = new Scanner(System.in);
        Random generator = new Random();

        while (true) {
            System.out.println("Introduceti miza. bugetul vostru este :" + buget);
            double miza = sc.nextDouble();
            if (miza > buget) {
                System.out.println("Nu ai atitia bani");
            } else {
                buget-=miza;

                System.out.println("Am tras de maneta");
                String rezultat1 = posibilitati.get(generator.nextInt(posibilitati.size()));
                String rezultat2 = posibilitati.get(generator.nextInt(posibilitati.size()));
                String rezultat3 = posibilitati.get(generator.nextInt(posibilitati.size()));

                printeazarezultatele(rezultat1, rezultat2, rezultat3);

                if (rezultat1.equals(rezultat2)&& rezultat2.equals(rezultat3)){
                    System.out.println("JACKPOT");
                    double deAdaugat = (30.0/100.0) * miza;
                    buget+=miza+deAdaugat;
                }else if (rezultat1.equals(rezultat2)  || rezultat1.equals(rezultat3) || rezultat2.equals(rezultat3)){
                    System.out.println("SEMIJACKPOT");
                    double deAdaugat = (90.0/100.0) * miza;
                    buget+=deAdaugat;
                }else {
                    System.out.println("Ai pierdut");
                }
                if (buget<=1){
                    System.out.println("Jocul sa sfirsit");
                    break;
                }else if (buget>=1000){
                    System.out.println("Castigat jocul");
                    break;
                }
            }
        }
    }

    private static void printeazarezultatele(String rezultat1, String rezultat2, String rezultat3) {
        System.out.println("[ " + rezultat1 + " ] [ " + rezultat2 + " ] [ " + rezultat3 + " ]");
    }
}
