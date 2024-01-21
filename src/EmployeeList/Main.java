package EmployeeList;

import EmployeeList.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employee = new ArrayList<>();

        System.out.print("How many employees will be registered?");
        int countEmployees = sc.nextInt();

        for (int i = 0; i < countEmployees; i++) {

            System.out.println("Employee #" + (i+1));

            System.out.print("Id: ");
            int idEmployee = sc.nextInt();

            sc.nextLine();
            System.out.print("Name: ");
            String nameEmployee = sc.nextLine();

            System.out.print("Salary: ");
            double salaryEmployee = sc.nextDouble();

            employee.add(new Employee(nameEmployee, idEmployee, salaryEmployee));
        }

        System.out.print("Enter the employee id that will have salary increase:");
        int idIncrease = sc.nextInt();

        boolean dontExist =  true;

        for (Employee x : employee) {
            if (idIncrease == x.getId()) {

                System.out.println("Enter the percentage:");
                double percentage = sc.nextDouble();
                x.IncreaseSalary(percentage);
                dontExist = false;

            }
        }

        if (dontExist) {
            System.out.println("The id does not exist!");
        }


        System.out.println("List of employees:");

        for (Employee x : employee) {
            System.out.println(x);
        }


        sc.close();
    }
}