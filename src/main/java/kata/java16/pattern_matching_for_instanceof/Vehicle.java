package kata.java16.pattern_matching_for_instanceof;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Vehicle {

    private final String licencePlate;
    private final int engineSerialNumber;

    public abstract void startEngine();

    public abstract void stopEngine();
}
