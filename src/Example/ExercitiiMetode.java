package Example;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercitiiMetode {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> noteRomana = new ArrayList<>();
        ArrayList<Double> noteMate = new ArrayList<>();
        ArrayList<Double> noteEngleza = new ArrayList<>();
        ArrayList<Double> noteFranceza = new ArrayList<>();

        int noteAdaugateRomana = 0;
        while (noteAdaugateRomana < 3) {
            System.out.println("Introdu nota la romana");
            double nota = scanner.nextDouble();
            if (nota >= 1 && nota <= 10) {
                noteRomana.add(nota);
                noteAdaugateRomana++;
            }else {
                System.out.println("Poti introduce note intre 1 si 10");
            }
        }

        int noteAdaugateMate = 0;
        while (noteAdaugateMate < 3) {
            System.out.println("Introdu nota la matematica");
            double nota = scanner.nextDouble();
            if (nota >= 1 && nota <= 10) {
                noteMate.add(nota);
                noteAdaugateMate++;
            }else {
                System.out.println("Poti introduce note intre 1 si 10");
            }
        }

        int noteAdaugateEngleza = 0;
        while (noteAdaugateEngleza < 3) {
            System.out.println("Introdu nota la engleza");
            double nota = scanner.nextDouble();
            if (nota >= 1 && nota <= 10) {
                noteEngleza.add(nota);
                noteAdaugateEngleza++;
            }else {
                System.out.println("Poti introduce note intre 1 si 10");
            }
        }

        int noteAdaugateFranceza = 0;
        while (noteAdaugateFranceza < 3) {
            System.out.println("Introdu nota la franceza");
            double nota = scanner.nextDouble();
            if (nota >= 1 && nota <= 10) {
                noteFranceza.add(nota);
                noteAdaugateFranceza++;
            }else {
                System.out.println("Poti introduce note intre 1 si 10");
            }
        }

        double totalRomana=0;
        double totalMate=0;
        double totalEngleza=0;
        double totalFranceza=0;

        for (double numar : noteRomana){
            totalRomana+=numar;
        }

        for (double numar : noteMate){
            totalMate+=numar;
        }

        for (double numar : noteEngleza){
            totalEngleza+=numar;
        }

        for (double numar : noteFranceza){
            totalFranceza+=numar;
        }
        double medieRomana=totalRomana/noteRomana.size();
        double medieMate=totalMate/noteMate.size();
        double medieEngleza=totalEngleza/noteEngleza.size();
        double medieFranceza=totalFranceza/noteFranceza.size();

        double medieGenerela =(medieRomana+medieMate+medieFranceza+medieEngleza)/4;

        System.out.println("Note Romana : " +noteRomana.get(0)+" "+noteRomana.get(1)+" "+noteRomana.get(2)+ " - Media : "+ medieRomana);
        System.out.println("Note Matematica : " +noteMate.get(0)+noteMate.get(1)+noteMate.get(2)+ " - Media : "+ medieMate);
        System.out.println("Note Engleza : " +noteEngleza.get(0)+noteEngleza.get(1)+noteEngleza.get(2)+ " - Media : "+ medieEngleza);
        System.out.println("Note Franceza : " +noteFranceza.get(0)+noteFranceza.get(1)+noteFranceza.get(2)+ " - Media : "+ medieFranceza);
        System.out.println("Medie generala : " + medieGenerela);
        System.out.println(medieGenerela>=5 ? "A trecut" : "A picat");
    }
}
