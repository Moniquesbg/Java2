import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaneTest {
    private Car vwUp;
    private Car mercedes;
    private Lane lane1;
    @BeforeEach
    void setUp() {
        vwUp = new Car("kl-23-dw", "white");
        mercedes = new Car("34-mw-2m", "black");
        lane1 = new Lane('1');

        lane1.parkCar(vwUp);
        lane1.parkCar(mercedes);
    }

    @Test
    void parkCar() {
        assertEquals("Car is parked", lane1.parkCar(vwUp), "vwUp couldnt park");
    }

    @Test
    void removeCarByLicensePlate()
    {
        assertTrue(lane1.removeCarByLicensePlate("kl-23-dw"));
        assertFalse(lane1.removeCarByLicensePlate("dwadawkadnk"));
    }

    @Test
    void getSpotAvailability()
    {
        assertEquals("Occupied", lane1.getSpotAvailability(0), "WRONG");
        assertEquals("Occupied", lane1.getSpotAvailability(1), "WRONG");
        assertEquals("Free", lane1.getSpotAvailability(2), "WRONG");
    }
}