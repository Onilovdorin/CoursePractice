package Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Spanzuratoarea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();

        ArrayList<String> cuvinte = new ArrayList<>(Arrays.asList("tekwill", "academy", "java", "programator", "incepator"));

        String cuvint = cuvinte.get(generator.nextInt(cuvinte.size()));
        int vietiRamase = 5;

        char[] litere = cuvint.toCharArray();
        char[] cuvintAfisat = new char[litere.length];
        Arrays.fill(cuvintAfisat, '_');

        afiseazaCuvintul(cuvintAfisat);

        while (true) {
            System.out.println("Introduce-ti o litere(vieti ramase = " + vietiRamase + ")");
            char literaIntrodusa = scanner.next().charAt(0);
            boolean cuvintulContineLitera = false;
            for (int i = 0; i < litere.length; i++) {
                if (literaIntrodusa == litere[i]) {
                    cuvintAfisat[i] = literaIntrodusa;
                    cuvintulContineLitera = true;
                }
            }
            if (!cuvintulContineLitera) {
                vietiRamase--;
            }
            if (vietiRamase <= 0) {
                System.out.println("Ai pierdut jocul");
                break;
            }
            if (Arrays.equals(litere, cuvintAfisat)) {
                System.out.println("Ai castigat jocul");
                afiseazaCuvintul(cuvintAfisat);
                break;
            }

            afiseazaCuvintul(cuvintAfisat);
        }

    }

    private static void afiseazaCuvintul(char[] cuvintAfisat) {
        for (char c : cuvintAfisat) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
