package kata.java16.pattern_matching_for_instanceof;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Garage {

    private List<Vehicle> floorA = new ArrayList<>();
    private List<Vehicle> floorB = new ArrayList<>();

    /**
     * Use instanceof to send the vehicles to the right floor level
     * Cars to the Floor A
     * Trailers to the Floor B
     * Use the new Java 16 pattern matching
     *
     * @param vehicle the sortable vehicle
     */
    public void vehicleRegister(Vehicle vehicle) {

    }
}
