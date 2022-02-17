package lesson10.homework;

public class ConvertString {
    public static void main(String[] args) {

        Boolean b = new Boolean("TRUE");
        boolean b1 = b;
        System.out.println("Value of b:   " + b);
        System.out.println("Value of b1:  " + b1);

        Byte bt = new Byte("120");
        byte bt1 = bt;
        System.out.println("Value of bt:  " + bt);
        System.out.println("Value of bt1: " + bt1);

        Short sh = new Short("32000");
        short sh1 = sh;
        System.out.println("Value of sh:  " + sh);
        System.out.println("Value of sh1: " + sh1);

        Integer i = new Integer("147895632");
        int i1 = i;
        System.out.println("Value of i:   " + i);
        System.out.println("Value of i1:  " + i1);

        Long l = new Long("987654321987654321");
        long l1 = l;
        System.out.println("Value of l:   " + l);
        System.out.println("Value of l1:  " + l1);

        Double d = new Double("4444.5d");
        double d1 = d;
        System.out.println("Value of d:   " + d);
        System.out.println("Value of d1:  " + d1);

        Float f = new Float("2354.56f");
        float f1 = f;
        System.out.println("Value of f:   " + f);
        System.out.println("Value of f1:  " + f1);
    }
}
