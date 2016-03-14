package person;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddressTest {
    @Test
    public void testGetCountryName() throws Exception {
        City city = new City("Lucknow");
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(city, state,country);

        assertEquals("India",address.getCountryName());

    }

    @Test
    public void getCityNameGivesTheNameOfCity() throws Exception {
        City city = new City("Lucknow");
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(city, state,country);
        assertEquals(city.getCityName(),address.getCityName());
    }

    @Test
    public void getStateNameGivesTheNameOfState() throws Exception {
        City city = new City("Lucknow");
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(city, state,country);
        assertEquals(state.getName(),address.getStateName());
    }
}