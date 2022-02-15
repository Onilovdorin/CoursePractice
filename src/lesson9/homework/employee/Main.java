package lesson9.homework.employee;

public class Main {

    public static void main(String[] args) {

        Employee[] arr = new Employee[3];
        arr[0] = new Employee(1994, 4000, "Robert", "WallStreet\n");
        arr[1] = new Employee(2000, 3500, "Sam  ", "WallStreet\n");
        arr[2] = new Employee(1999, 3000, "John", "WallStreet\n");

        for (Employee employee : arr) {
            employee.display();

        }
    }
}
