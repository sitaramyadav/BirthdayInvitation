import org.junit.Test;

import static org.junit.Assert.*;

public class CountryTest {

    @Test
    public void testGetCountryName() throws Exception {
        Country country = new Country("Delhi");
        assertEquals("Delhi",country.getName());
    }
}