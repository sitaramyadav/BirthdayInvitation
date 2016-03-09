import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {

    @Test
    public void testGetCityName() throws Exception {
        City city = new City("Gkp");
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(city,state,country);

        assertEquals("Gkp",address.getCityName());
    }

    @Test
    public void testGetStateName() throws Exception {
        City city = new City("Gkp");
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(city,state,country);

        assertEquals("U.P.",address.getStateName());

    }

    @Test
    public void testGetCountryName() throws Exception {
        City city = new City("Gkp");
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(city,state,country);

        assertEquals("India",address.getCountryName());

    }
}