import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {
    @Test
    public void testGetCountryName() throws Exception {
        String city = "Gkp";
        String state = "U.P.";
        Country country = new Country("India");
        Address address = new Address(city,state,country);

        assertEquals("India",address.getCountryName());

    }
}