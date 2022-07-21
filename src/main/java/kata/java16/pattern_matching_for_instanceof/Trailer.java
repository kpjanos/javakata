package kata.java16.pattern_matching_for_instanceof;

import lombok.Getter;

@Getter
public class Trailer extends Vehicle {

    public Trailer(String licencePlate, int engineSerialNumber) {
        super(licencePlate, engineSerialNumber);
    }

    @Override
    public void startEngine() {
        System.out.println("Trailer engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Trailer engine stopped");
    }
}
