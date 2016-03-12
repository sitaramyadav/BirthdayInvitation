package person;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddressTest {
    @Test
    public void testGetCountryName() throws Exception {
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(state,country);

        assertEquals("India",address.getCountryName());

    }

    @Test
    public void getStateNameGivesTheNameOfState() throws Exception {
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(state,country);
        assertEquals(state,address.getStateName());
    }
}