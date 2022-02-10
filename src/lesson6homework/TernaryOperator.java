package lesson6homework;

public class TernaryOperator {

    public static void main(String[] args) {

        color("100");
    }

    public static void color(String colorCode) {

        String color;

        color = colorCode.equals("100") ? "Yellow" : colorCode.equals("101") ?
                "Green" : colorCode.equals("102") ? "Red" : "Invalid";
        System.out.println("Color with number " + colorCode + " is " + color);
    }
}
