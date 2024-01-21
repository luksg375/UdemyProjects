package EmployeeList.entities;

public class Employee {

    private String name;
    private int id;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void IncreaseSalary(double percentage) {
        salary += salary * percentage / 100;
    }

    public String toString() {
            return id
                    + ", "
                    + name
                    + ", "
                    + String.format("%.2f", salary);
    }

}
