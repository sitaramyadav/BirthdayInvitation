package person;

import org.junit.Test;

import static org.junit.Assert.*;

public class CityTest {

    @Test
    public void getCityNameGivesTheCityName() throws Exception {
        City city = new City("Lucknow");
        assertEquals("Lucknow",city.getCity());
    }
}