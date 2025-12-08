package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 12/3/2025
 */
public class FilterEmployees {
    public static void main(String[] args) {
        List<Employee2> employee2s = Arrays.asList(
                new Employee2(1, "Rajan", 45000),
                new Employee2(2, "Amit", 55000),
                new Employee2(3, "Neha", 75000),
                new Employee2(4, "Suresh", 30000)
        );
        List<String> result = filterName(employee2s);
        System.out.println(result);
    }

    private static List<String> filterName(List<Employee2> employee2s) {
        return employee2s.stream().filter(e -> e.getSalary() > 5000)
                .map(Employee2::getName)
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
    }
}

class Employee2 {
    int id;
    String name;
    double salary;

    public Employee2(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
