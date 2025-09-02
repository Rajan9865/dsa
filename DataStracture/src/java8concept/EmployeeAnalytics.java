package java8concept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 9/2/2025
 */
class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeAnalytics {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee(1, "Alice", "HR", 60000),
                new Employee(2, "Bob", "IT", 75000),
                new Employee(3, "Charlie", "Finance", 80000),
                new Employee(4, "David", "IT", 72000),
                new Employee(5, "Eve", "HR", 68000));
        System.out.println(employees.stream().collect(Collectors.counting()));
        System.out.println(employees.stream().collect(Collectors.summingInt(e -> (int) e.getSalary())));

//                .stream()
//                .filter(e -> e.getDepartment().equals("IT"))
//                .mapToDouble(Employee::getSalary)
//                .average()
//                .ifPresent(avg -> System.out.println("Average IT Salary: " + avg));
    }
}
