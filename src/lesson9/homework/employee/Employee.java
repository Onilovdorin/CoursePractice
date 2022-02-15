package lesson9.homework.employee;

public class Employee {
    public int yearOfJoining, salary;
    public String name, address;

    public Employee(int yearOfJoining, int salary, String name, String address) {
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.name = name;
        this.address = address;

    }

    public void display() {
        System.out.println("Name \t Year of Joining \t Salary \t Address");
        System.out.println("" + name + "\t\t" + yearOfJoining + "\t\t\t\t" + salary + "\t\t" + address);
    }
}

