package lesson18.homework.Employees;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<EmployeesFiveYears> listOfWorkers = new ArrayList<>();
        boolean menu = true;
        Scanner input = new Scanner(System.in);

        while (menu) {

            EmployeesFiveYears obj = new EmployeesFiveYears();

            System.out.println("Would you like to add an employee? - 1" +
                    "\n" + "Print employees that work more then 5 years - 2");
            int menuTest = input.nextInt();

            if (menuTest == 1) {

                System.out.println("Please enter the first name");
                String firstName = input.next();
                obj.setFirstName(firstName);

                System.out.println("Please enter the last name");
                String secondName = input.next();
                obj.setLastName(secondName);

                System.out.println("Please enter the number of years in company");
                int numOfYears = input.nextInt();
                obj.setYearsInCompany(numOfYears);


                listOfWorkers.add(obj);
            }

            if (menuTest == 2) {

                for (int i = 0; i < listOfWorkers.size(); i++) {

                    if (listOfWorkers.get(i).getYearsInCompany() >= 5) {

                        System.out.println("First name " + listOfWorkers.get(i).getFirstName()
                                + "\n" + "Last name " + listOfWorkers.get(i).getLastName()
                                + "\n" + "Years in company " + listOfWorkers.get(i).getYearsInCompany());
                    }

                    menu = false;
                }
            }
        }
        input.close();
    }
}
