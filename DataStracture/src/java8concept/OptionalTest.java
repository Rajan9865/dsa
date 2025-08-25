package java8concept;

import java.util.Optional;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/25/2025
 */
public class OptionalTest {
    public static void main(String[] args) {
        Person person = new Person("Rajan", "India");
        Optional<Person> person1 = Optional.ofNullable(person);
        String defaultName = person1.map(Person::getName).orElse("default name");
        System.out.println(defaultName);
    }
}

class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
