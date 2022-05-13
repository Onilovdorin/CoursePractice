package Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Spanzuratoarea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();

        ArrayList<String> cuvinte = new ArrayList<>(Arrays.asList("ANA-MINOIU","VERONICA-PORUBIN","DENIS-CUCIUC","ALEXANDRU-CULICOV","DORIN-ONILOV","DUMITRU-MIHAES","ANDREI-BOLUN","VICTORIA-ROSCA","PARASCOVIA-EFROS","ZINAIDA-VERLAN"));

        String cuvint = cuvinte.get(generator.nextInt(cuvinte.size()));
        int vietiRamase = 5;

        char[] litere = cuvint.toCharArray();
        char[] cuvintAfisat = new char[litere.length];
        Arrays.fill(cuvintAfisat, '_');

        afiseazaCuvintul(cuvintAfisat);

        while (true) {
            System.out.println("Ghiceste numele. Introdu o litera (vieti ramase = " + vietiRamase + ")");
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
                System.out.println("Ce pacat! Nu ai ghicit! ('_')");
                break;
            }
            if (Arrays.equals(litere, cuvintAfisat)) {
                System.out.println("Felicitari! Ai ghicit! (^_^)");
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
