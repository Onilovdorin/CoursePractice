package lesson9.homework.area;

public class Area {

    int length, width;

    Area(int l, int w) {
        length = l;
        width = w;
    }

    public int setDim() {
        int results = length * width;
        return results;
    }

    public void getArea() {
        System.out.println("Area = " + setDim());
    }
}
