package java8;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 9/16/2025
 */
class Employee1 {
    private String name;
    private String department;
    private int salary;

    public Employee1(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class EmployeeSalaryAnalyzer {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(new Employee1("Alice", "IT", 7000),
                new Employee1("Bob", "HR", 5000),
                new Employee1("Charlie", "IT", 9000),
                new Employee1("David", "HR", 6000));
        Map<String, Optional<Employee1>> result = highestPayByDepartment(employees);
        printResult(result);
        printResult1(result);
        printResult2(result);
    }

    private static void printResult(Map<String, Optional<Employee1>> result) {
        result.entrySet().forEach(entry -> {
            entry.getValue().ifPresent(emp ->
                    System.out.println("department:- " + entry.getKey() + " | employee " + emp.getName() + " | salary " + emp.getSalary()));
        });
    }

    private static Map<String, Optional<Employee1>> highestPayByDepartment(List<Employee1> employees) {
        return employees.stream().collect(Collectors.groupingBy(Employee1::getDepartment
                , Collectors.maxBy(Comparator.comparingInt(Employee1::getSalary))));
    }

    private static void printResult2(Map<String, Optional<Employee1>> result) {
        System.out.println("3rd way to print map");
        result.forEach((dept, empopt) -> {
            if (empopt.isPresent()) {
                Employee1 employee1 = empopt.get();
                System.out.println("department " + dept + " eployee " + employee1.getName() + " salary " + employee1.getSalary());
            }
        });
    }

    private static void printResult1(Map<String, Optional<Employee1>> result) {
        System.out.println("2nd way to print ");
        result.entrySet().forEach(entry -> {
            String message = entry.getValue().map(emp -> "department " + entry.getKey() + " employee " + emp.getName()
                    + " salary " + emp.getSalary()).orElse("department " + entry.getKey() + " employe details are not found");
            System.out.println(message);
        });
    }

}
