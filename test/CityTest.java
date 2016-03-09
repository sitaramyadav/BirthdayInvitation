import org.junit.Test;

import static org.junit.Assert.*;

public class CityTest {

    @Test
    public void testGetCityName() throws Exception {
        City city = new City("Bangalore");

        assertEquals("Bangalore",city.getName());
    }
}