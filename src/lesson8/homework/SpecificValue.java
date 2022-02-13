package lesson8.homework;

public class SpecificValue {
    public static void main(String[] args) {
        int[] num = {10, 21, 4, 57, 18, 33, 87};
        int find = 4;
        boolean found = false;

        for (int n : num) {
            if (n == find) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(find + " is found");
        else
            System.out.println(find + " is not found");
    }
}
