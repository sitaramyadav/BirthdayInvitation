package person;

import org.junit.Test;
import person.Country;

import static org.junit.Assert.*;

public class CountryTest {

    @Test
    public void testGetCountryName() throws Exception {
        Country country = new Country("Delhi");
        assertEquals("Delhi",country.getName());
    }
}