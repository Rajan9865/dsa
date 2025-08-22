package java8concept;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/22/2025
 */

interface Vehicle {
    void start();

    default void fueltype() {
        System.out.println("Petrol");
    }
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car started");
    }
}

public class Default1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.fueltype();
    }
}
