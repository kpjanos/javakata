package kata.java16.pattern_matching_for_instanceof;

import lombok.Getter;

@Getter
public class Car extends Vehicle {

    public Car(String licencePlate, int engineSerialNumber) {
        super(licencePlate, engineSerialNumber);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }
}
