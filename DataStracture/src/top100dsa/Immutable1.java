package top100dsa;

import java.util.Date;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/24/2026
 */
public class Immutable1 {
    static void main() {
        Date originalDate = new Date();
        Employee employee = new Employee("rajan", 26, originalDate);
        System.out.println("before change: " + employee.getJoiningDate());
        originalDate.setTime(0);
        System.out.println("after change: " + employee.getJoiningDate());
    }
}

final class Employee {
    private final String name;
    private final int age;

    private final Date joiningDate;

    public Employee(String name, int age, Date joiningDate) {
        this.name = name;
        this.age = age;
        this.joiningDate = new Date(joiningDate.getTime());
//        this.joiningDate = joiningDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getJoiningDate() {
//        return joiningDate;
        return new Date(joiningDate.getTime());
    }
}
