package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/25/2025
 */
public class Sortemployeesbysalary {
    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(new Employee("Rajan", 5000),
                new Employee("Kumar", 3000),
                new Employee("Java", 4000));
        List<Employee> output = sortBySalary(employee);
        printResult(output);
    }

    private static void printResult(List<Employee> employee) {
        employee.stream().forEach(s -> System.out.println("name" + s.getName() + " salary " + s.getSalary()));
    }

    private static List<Employee> sortBySalary(List<Employee> employee) {
        return employee.stream().sorted(Comparator.comparingDouble(e -> e.getSalary())).collect(Collectors.toList());
    }
}

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
