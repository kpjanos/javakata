package kata.java16.pattern_matching_for_instanceof;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GarageTest {

    private final Vehicle vehicle1 = new Car("ABC-123", 12345);
    private final Vehicle vehicle2 = new Trailer("DEF-456", 67890);
    private final Vehicle vehicle3 = new Trailer("GHI-789", 12345);

    @Test
    void bothFloorsMustContainsOneVehicleWhenGetACarAndATrailer() {
        Garage garage = new Garage();

        garage.vehicleRegister(vehicle1);
        garage.vehicleRegister(vehicle2);

        assertEquals(garage.getFloorA().size(), 1);
        assertEquals(garage.getFloorB().size(), 1);
    }

    @Test
    void floorBMustContainsTwoVehicleWhenGetTwoTrailer() {
        Garage garage = new Garage();

        garage.vehicleRegister(vehicle2);
        garage.vehicleRegister(vehicle3);

        assertEquals(garage.getFloorA().size(), 0);
        assertEquals(garage.getFloorB().size(), 2);
    }
}
