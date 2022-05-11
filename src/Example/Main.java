package Example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introdu primul numar");
//        int nr1 = scanner.nextInt();
//        System.out.println("Introdu operatorul");
//        char operator = scanner.next().charAt(0);
//        System.out.println("Introdu al doilea numar");
//        int nr2 = scanner.nextInt();
//
//        switch (operator) {
//            case '+':
//                System.out.println(sum(nr1, nr2));
//                break;
//            case '-':
//                System.out.println(difference(nr1, nr2));
//                break;
//            case '*':
//                System.out.println(multiply(nr1, nr2));
//                break;
//            case '/':
//                System.out.println(divide(nr1, nr2));
//                break;
//            case '%':
//                System.out.println(modulo(nr1, nr2));
//                break;
//            case '^':
//                System.out.println(power(nr1,nr2));
//                break;
//            default:
//                System.out.println("Nu ai introdus un operator valabil ");
//        }


//        System.out.println(factorial(5));

//        System.out.println(FizzBuzz(9));

//        ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9));
//        ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6));
//
//        boolean primaMaiMare = compara(lista1, lista2);
//        System.out.println(primaMaiMare);

//        printeaza("abcdef");
//        System.out.println();
//        printeaza("12345");

//        System.out.println(estePalindrom("ana"));
//        System.out.println(estePalindrom("dana"));

//        ArrayList<Integer> numere = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 1, 2));
//        deCateOriContine(numere, 2);

        int[] numere = {3, 4, 6, 77, 33, 13, 43, 22, 4};
        printeaza(numere);


    }

    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    public static int difference(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public static int divide(int n1, int n2) {
        return n1 / n2;
    }

    public static int modulo(int n1, int n2) {
        return n1 % n2;
    }

    public static int power(int n1, int n2) {
        int rezultat = n1;
        for (int i = 2; i <= n2; i++) {
            rezultat *= n1;
        }
        return rezultat;
    }

    public static int factorial(int numar) {
        int nr = 1;
        if (numar >= 1) {
            for (int i = 1; i <= numar; i++) {
                nr *= i;
            }
            return nr;
        }
        return 0;
    }

    public static boolean compara(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        boolean toateSuntMaiMari = true;

        for (int numar : lista1) {
            for (int numar2 : lista2) {
                if (numar2 > numar) {
                    toateSuntMaiMari = false;
                }
            }
        }

        return toateSuntMaiMari;
    }

    public static String FizzBuzz(int numar) {
        if (numar % 15 == 0) {
            return "FizzBuzz";
        } else if (numar % 5 == 0) {
            return "Buzz";
        } else if (numar % 3 == 0) {
            return "Fizz";
        }
        return "Numar invali";
    }

//    public static void printeaza(String text) {
//        char[] litere = text.toCharArray();
//        for (int i = litere.length - 1; i >= 0; i--) {
//            System.out.print(litere[i]);
//        }
//    }

    public static boolean estePalindrom(String cuvint) {
        char[] litere = cuvint.toCharArray();
        for (int i = 0; i < litere.length / 2; i++) {
            if (litere[i] != litere[litere.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void deCateOriContine(ArrayList<Integer> lista, int numar) {
        int count = 0;
        for (int nr : lista) {
            if (nr == numar) {
                count++;
            }
        }
        System.out.println("In lista data numar - " + numar + " a fost prezent de " + count + " ori");
    }

    public static void printeaza(int[] numere) {
        for (int i = 0; i < numere.length; i++) {
            for (int j = i + 1; j < numere.length; j++) {
                if (numere[i] > numere[j]) {
                    int temp = numere[i];
                    numere[i] = numere[j];
                    numere[j] = temp;
                }
            }
        }
        for (int numar : numere) {
            System.out.print(numar + " ");
        }
    }

}
