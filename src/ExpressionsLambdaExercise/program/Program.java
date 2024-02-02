package ExpressionsLambdaExercise.program;

import ExpressionsLambdaExercise.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path:");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> employeeList = new ArrayList<>();
            String line = br.readLine();

            while(line != null) {
                String[] splitLine = line.split(",");
                employeeList.add(new Employee(splitLine[0], splitLine[1], Double.parseDouble(splitLine[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary:");
            double salary = sc.nextDouble();

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> emails = employeeList.stream().filter(employee -> employee.getSalary() > salary).map(employee -> employee.getEmail()).sorted(comp).collect(Collectors.toList());

            emails.forEach(System.out::println);

            double sum = employeeList.stream().filter(employee -> employee.getName().charAt(0) == 'M').map(employee -> employee.getSalary()).reduce(Double.MIN_VALUE, (x, y) -> x + y);

            System.out.println("Sum of salary of people whose name starts with 'M': " + sum);

        } catch (IOException ioException) {
            System.out.println("Error: " + ioException.getMessage());
        } finally {
            sc.close();
        }

    }
}
